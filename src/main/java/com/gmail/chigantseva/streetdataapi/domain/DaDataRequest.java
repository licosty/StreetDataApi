package com.gmail.chigantseva.streetdataapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DaDataRequest {
    @JsonProperty("query")
    private String query;

    @JsonProperty("locations")
    private List<Location> locations;

    @JsonProperty("count")
    private Integer count;

    @JsonProperty("language")
    private String language;

    @JsonProperty("from_bound")
    private Bound fromBound;

    @JsonProperty("to_bound")
    private Bound toBound;

    @Autowired
    public DaDataRequest(Location location) {
        locations = new ArrayList<>();
        locations.add(location);
        count = 20;
        language = "ru";
        fromBound = new Bound("street");
        toBound = new Bound("street");
    }
}
