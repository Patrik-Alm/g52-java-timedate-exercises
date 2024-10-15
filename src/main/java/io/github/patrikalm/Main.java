package io.github.patrikalm;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        date = date.plusYears(10);

        date = date.minusMonths(10);

        Month month = date.getMonth();

        System.out.println(month);

    }
}