package com.gmail.chigantseva.streetdataapi.util;

public class Util {
    private static String OS = System.getProperty("os.name").toLowerCase();

    public static boolean isWindows() {
        return (OS.contains("win"));
    }
}
