package com.gmail.chigantseva.streetdataapi.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Suggestion {
    @JsonAlias("value")
    private String value;

    @JsonAlias("unrestricted_value")
    private String unrestrictedValue;

    @JsonAlias("data")
    private Data data;
}
