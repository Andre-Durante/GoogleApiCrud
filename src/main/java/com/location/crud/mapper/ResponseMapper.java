package com.location.crud.mapper;

import com.location.crud.api.rest.response.LocationCrudCreateResponse;
import com.location.crud.repository.LocationCrudData;
import org.springframework.stereotype.Component;

@Component
public class ResponseMapper {

    public LocationCrudCreateResponse mapResponse(LocationCrudData request, String Description){
        return LocationCrudCreateResponse.builder()
                .id(request.getId())
                .description(Description)
                .build();
    }

}
