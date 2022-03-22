package com.gmail.chigantseva.streetdataapi.service;

import com.gmail.chigantseva.streetdataapi.domain.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class StreetDataService {
    private HttpClientService httpClientService;
    private DaDataRequest daDataRequest;

    public StreetDataResponse getCountOfStreets(String query) {
        StreetDataResponse streetDataResponse = null;
        String request = null;
        String response = null;

        try {
            daDataRequest.setQuery(query);

            ObjectMapper requestMapper = new ObjectMapper();
            request = requestMapper.writeValueAsString(daDataRequest);

            response = httpClientService.sendPost(request);

            ObjectMapper mapperResponse = new ObjectMapper();
            DaDataResponse daDataResponse = mapperResponse.readValue(response, DaDataResponse.class);

            streetDataResponse = new StreetDataResponse();
            List<Suggestion> suggestions = daDataResponse.getSuggestions();

            streetDataResponse.setCount(suggestions.size());

            List<String> streets = suggestions.stream()
                    .map(suggestion -> suggestion.getData().getStreetWithType())
                    .distinct()
                    .collect(Collectors.toList());

            streetDataResponse.setStreets(streets);

        } catch (JsonMappingException e) {
            log.error("Json mapping error: {}", response, e);
        } catch (JsonProcessingException e) {
            log.error("Error converting object to json: {}", daDataRequest, e);
        } catch (IOException e) {
            log.error("Error sending post request: {}", request, e);
        }

        return streetDataResponse;
    }

    @Autowired
    public void setHttpClientService(HttpClientService httpClientService) {
        this.httpClientService = httpClientService;
    }

    @Autowired
    public void setDaDataRequest(DaDataRequest daDataRequest) {
        this.daDataRequest = daDataRequest;
    }
}
