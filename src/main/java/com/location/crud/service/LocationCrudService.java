package com.location.crud.service;

import com.location.crud.api.rest.request.LocationCrudCreateRequest;
import com.location.crud.api.rest.response.LocationCrudCreateResponse;
import com.location.crud.api.rest.response.LocationCrudReadResponse;
import com.location.crud.client.GoogleClient;
import com.location.crud.dto.GoogleClientData;
import com.location.crud.mapper.LocationCrudDataMapper;
import com.location.crud.mapper.ResponseMapper;
import com.location.crud.repository.LocationCrudData;
import com.location.crud.repository.LocationCrudRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationCrudService {

    private final Logger logger;
    private final LocationCrudRepository repository;
    private final LocationCrudDataMapper dataMapper;
    private final ResponseMapper responseMapper;
    private final GoogleClient googleClient;

    public LocationCrudService(
            LocationCrudRepository repository,
            LocationCrudDataMapper dataMapper,
            ResponseMapper responseMapper,
            GoogleClient googleClient
    ) {
        this.logger = LoggerFactory.getLogger(LocationCrudService.class);
        this.repository = repository;
        this.dataMapper = dataMapper;
        this.responseMapper = responseMapper;
        this.googleClient = googleClient;
    }

    public LocationCrudCreateResponse sendRequestToMongo(LocationCrudCreateRequest request) throws Exception {
        logger.info("verifying if latitude and longitude are present in payload");

        LocationCrudData data = null;

        if(request.getLatitude() == null || request.getLongitude() == null){
            logger.info("Searching latitude and longitude");
            GoogleClientData googleData = googleClient.retrieveGoogleData(request.getNumber(), request.getStreetName(), request.getCity());
            data = dataMapper.requestToData(request,
                    googleData.getResults()[0].getGeometry().getLocation().getLat(),
                    googleData.getResults()[0].getGeometry().getLocation().getLng());
        } else{
            data = dataMapper.requestToData(request);
        }

        logger.info("Saving data on MongoDb");
        data = repository.save(data);

        LocationCrudCreateResponse response = responseMapper.mapCreateResponse(data, "Sucesso na requisição");

        return response;
    }

    public Optional<LocationCrudReadResponse> searchOnMongo(String id){

        logger.info("Searching on mongo: {}", id);
        Optional<LocationCrudData> data = repository.findById(id);

        return data.map(responseMapper::mapReadResponse);
    }

}
