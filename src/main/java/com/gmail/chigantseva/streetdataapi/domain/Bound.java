package com.gmail.chigantseva.streetdataapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Bound {
    @JsonProperty("value")
    private String value;
}
