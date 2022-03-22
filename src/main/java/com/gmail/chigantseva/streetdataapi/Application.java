package com.gmail.chigantseva.streetdataapi;

import com.gmail.chigantseva.streetdataapi.view.ConsoleView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        ConsoleView consoleView = ConsoleView.get();
        consoleView.getStreets();
    }
}
