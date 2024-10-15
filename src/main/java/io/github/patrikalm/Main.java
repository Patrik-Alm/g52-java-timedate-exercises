package io.github.patrikalm;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate myBirthdate = LocalDate.parse("1972-02-19");

        LocalDate date = LocalDate.now();

        date = date.plusYears(10).minusMonths(10);

        Period duration = Period.between(myBirthdate,date);
        System.out.println();
        System.out.println(duration.toString());
        System.out.println();
        System.out.print("Total number of years: ");
        System.out.println(duration.getYears());
        System.out.print("Total number of months: ");
        System.out.println(duration.getMonths());
        System.out.print("Total number of days: ");
        System.out.println(duration.getDays());


    }
}