package com.gmail.chigantseva.streetdataapi.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Location {
    @Value("${location.cityFiasId}")
    @JsonProperty("city_fias_id")
    private String cityFiasId;
}
