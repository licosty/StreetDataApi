package com.gmail.chigantseva.streetdataapi.view;

import com.gmail.chigantseva.streetdataapi.controller.StreetDataController;
import com.gmail.chigantseva.streetdataapi.util.Util;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class ConsoleView implements View, InitializingBean {
    private StreetDataController controller;
    private static ConsoleView instance;

    @Override
    public void getStreets() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String query = null;
            while (true) {
                System.out.println("\nВведите название улицы для поиска или <q> для выхода:");
                query = reader.readLine();

                if (query.equals("q")) System.exit(0);

                if (Util.isWindows()) {
                    byte[] bytes = query.getBytes("windows-1251");
                    query = new String(bytes, "IBM866");
                }

                System.out.println(controller.getCountOfStreets(query));
            }


        } catch (IOException e) {
            System.out.println("Не удалось получить данные");
        }
    }

    @Autowired
    public void setController(StreetDataController controller) {
        this.controller = controller;
    }

    @Override
    public void afterPropertiesSet() {
        instance = this;
    }

    public static ConsoleView get() {
        return instance;
    }
}
