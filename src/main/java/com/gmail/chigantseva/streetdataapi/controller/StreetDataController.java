package com.gmail.chigantseva.streetdataapi.controller;

import com.gmail.chigantseva.streetdataapi.domain.StreetDataResponse;
import com.gmail.chigantseva.streetdataapi.exception.BadRequestArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import com.gmail.chigantseva.streetdataapi.service.StreetDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class StreetDataController {
    private StreetDataService service;

    @GetMapping("/")
    public StreetDataResponse getCountOfStreets(@RequestParam(required = false, name = "query") String param) {
        Optional<String> query = Optional.ofNullable(param);

        return service.getCountOfStreets(query.orElseThrow(() -> new BadRequestArgumentException("Не задан параметр поиска")));
    }

    @Autowired
    public StreetDataController(StreetDataService service) {
        this.service = service;
    }
}
