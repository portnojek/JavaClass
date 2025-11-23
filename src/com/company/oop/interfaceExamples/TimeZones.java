package com.company.oop.interfaceExamples;

public class TimeZones {
    public static void main(String[] args) {
        System.out.println("Current time in UTC: " + java.time.ZonedDateTime.now(java.time.ZoneId.of("UTC")));
        System.out.println("Current time in PST: " + java.time.ZonedDateTime.now(java.time.ZoneId.of("America/Los_Angeles")));
        System.out.println("Current time in CET: " + java.time.ZonedDateTime.now(java.time.ZoneId.of("Europe/Warsaw")));
    }
}
