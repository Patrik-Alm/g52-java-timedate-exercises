package io.github.patrikalm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2024-10-14");

        for(int i=0; i<7; i++) {

        System.out.println(date.format(DateTimeFormatter.ofPattern("eeee")));
        date = date.plusDays(1);

        }
    }
}