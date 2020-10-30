package com.location.crud.mapper;

import com.location.crud.api.rest.response.LocationCrudCreateResponse;
import com.location.crud.api.rest.response.LocationCrudReadResponse;
import com.location.crud.repository.LocationCrudData;
import org.springframework.stereotype.Component;

@Component
public class ResponseMapper {

    public LocationCrudCreateResponse mapCreateResponse(LocationCrudData request, String Description){
        return LocationCrudCreateResponse.builder()
                .id(request.getId())
                .description(Description)
                .build();
    }

    public LocationCrudReadResponse mapReadResponse(LocationCrudData data){
        return LocationCrudReadResponse.builder()
                .id(data.getId())
                .streetName(data.getStreetName())
                .number(data.getNumber())
                .complement(data.getComplement())
                .neighbourhood(data.getNeighbourhood())
                .city(data.getCity())
                .state(data.getState())
                .country(data.getCountry())
                .zipcode(data.getZipcode())
                .latitude(data.getLatitude())
                .longitude(data.getLongitude())
                .build();
    }
}
