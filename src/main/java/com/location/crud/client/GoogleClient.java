package com.location.crud.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.location.crud.dto.GoogleClientData;
import com.location.crud.utils.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;

@Component
public class GoogleClient {

    private final Logger logger;
    private final HttpUtils httpUtils;

    private String uri;
    private String key;

    public GoogleClient(
            HttpUtils httpUtils,
            @Value("https://maps.googleapis.com/maps/api/geocode/json")
            String uri,
            @Value("${google.api.key}")
            String key
    ){
        this.logger = LoggerFactory.getLogger(GoogleClient.class);
        this.httpUtils = httpUtils;
        this.uri = uri;
        this.key = key;
    }

    public GoogleClientData retrieveGoogleData(String number, String street, String city) throws Exception {

        GoogleClientData data = null;

        logger.info("Retrieving data from Google Api");
        String response = httpUtils.sendGet(buildUri(number, street, city));

        if (response == null)
            throw new Exception("Null API return");

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            data = objectMapper.readValue(response,GoogleClientData.class);
        } catch (Exception e){
            logger.error("Cannot retrieve data from Google Api", e);
        }

        return data;
    }

    private String buildUri(String number, String street, String city) throws URISyntaxException {
        String bulkUri = uri;
        bulkUri = StringUtils.join(
                uri,
                "?", "address",
                "=", number,
                "+", street,
                ",", city,
                "+", "View",
                ",", "+CA&key",
                "=", key
        );
        return bulkUri;
    }
}
