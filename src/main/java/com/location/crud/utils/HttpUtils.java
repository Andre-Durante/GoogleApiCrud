package com.location.crud.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class HttpUtils {

    private final OkHttpClient httpClient = new OkHttpClient();

    public String sendGet(String uri) throws Exception {
        Request request = new Request.Builder()
                .url(uri)
                .addHeader("User-Agent", "OkHttp Bot")
                .build();

        try (Response response = httpClient.newCall(request).execute()) {

            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            return response.body().string();
        }

    }

}
