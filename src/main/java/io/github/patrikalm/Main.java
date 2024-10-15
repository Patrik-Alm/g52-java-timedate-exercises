package io.github.patrikalm;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate myBirthday = LocalDate.parse("1972-02-19");

        DayOfWeek weekday = myBirthday.getDayOfWeek();

        System.out.println(weekday);


    }
}