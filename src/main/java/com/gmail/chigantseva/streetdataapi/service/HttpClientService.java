package com.gmail.chigantseva.streetdataapi.service;

import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


@Setter
@NoArgsConstructor
@Component
public class HttpClientService {
    @Value("${dadata.url}")
    private String url;
    @Value("${dadata.apikey}")
    private String apikey;

    protected String sendPost(String json) throws IOException {
        StringEntity body = new StringEntity(json, ContentType.APPLICATION_JSON);

        HttpPost post = new HttpPost(url);
        post.setHeader("Accept", "application/json");
        post.setHeader("Content-Type", "application/json");
        post.setHeader("Authorization", "Token " + apikey);
        post.setEntity(body);

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(post)) {

            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                throw new HttpResponseException(statusCode, "Failed :" + response);
            }

            return EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
        }
    }
}
