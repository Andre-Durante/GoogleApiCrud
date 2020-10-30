package com.location.crud.api.rest;

import com.location.crud.api.rest.request.LocationCrudCreateRequest;
import com.location.crud.api.rest.response.LocationCrudCreateResponse;
import com.location.crud.api.rest.response.LocationCrudReadResponse;
import com.location.crud.service.LocationCrudService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;


@RestController
@RequestMapping("/v1/location")
public class LocationCrudApi {

    private Logger logger;
    private final LocationCrudService locationCrudService;

    public LocationCrudApi(LocationCrudService locationCrudService) {
        this.logger = LoggerFactory.getLogger(LocationCrudApi.class);
        this.locationCrudService = locationCrudService;
    }

    @PostMapping("/create")
    @ApiOperation(
            value = "Create Location",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = LocationCrudCreateResponse.class),
            @ApiResponse(code = 400, message = "Bad Request")}
    )
    public LocationCrudCreateResponse processRequest(
            @RequestBody LocationCrudCreateRequest request) throws Exception {
        logger.info("Request data for insert location: {}", request);
        return locationCrudService.sendRequestToMongo(request);
    }

    @GetMapping("/search/{id}")
    @ApiOperation(
            value = "Search Location on Data Base",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = LocationCrudCreateResponse.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not found")}
    )
    public LocationCrudReadResponse searchRequest(
            @PathVariable String id) {
        logger.info("Request data for search location on database: {}", id);
        return locationCrudService.searchOnMongo(id)
                .orElseThrow(() -> new NoSuchElementException());
    }

}
