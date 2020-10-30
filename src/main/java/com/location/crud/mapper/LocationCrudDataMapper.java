package com.location.crud.mapper;

import com.location.crud.api.rest.request.LocationCrudCreateRequest;
import com.location.crud.repository.LocationCrudData;
import org.springframework.stereotype.Component;

@Component
public class LocationCrudDataMapper {

    public LocationCrudData requestToData(LocationCrudCreateRequest request){
        return LocationCrudData.builder()
                .streetName(request.getStreetName())
                .number(request.getNumber())
                .complement(request.getComplement())
                .neighbourhood(request.getNeighbourhood())
                .city(request.getCity())
                .state(request.getState())
                .country(request.getCountry())
                .zipcode(request.getZipcode())
                .latitude(request.getLatitude())
                .longitude(request.getLongitude())
                .build();
    }

    public LocationCrudData requestToData(LocationCrudCreateRequest request, String lat, String lng){
        return LocationCrudData.builder()
                .streetName(request.getStreetName())
                .number(request.getNumber())
                .complement(request.getComplement())
                .neighbourhood(request.getNeighbourhood())
                .city(request.getCity())
                .state(request.getState())
                .country(request.getCountry())
                .zipcode(request.getZipcode())
                .latitude(lat)
                .longitude(lng)
                .build();
    }
}
