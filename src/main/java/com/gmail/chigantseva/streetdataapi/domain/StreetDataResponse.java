package com.gmail.chigantseva.streetdataapi.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StreetDataResponse {
    private Integer count;
    private List<String> streets;

    @Override
    public String toString() {
        return String.format(
                "{\n" +
                "   count : %d,\n" +
                "   streets : %s\n" +
                "}", count, streets);
    }
}
