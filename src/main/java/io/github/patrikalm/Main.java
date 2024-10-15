package io.github.patrikalm;


import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        Period period = Period.of(4,7,29);

        LocalDate today = LocalDate.now();

        LocalDate newDate = today.plusYears(period.getYears()).plusMonths(period.getMonths()).plusDays(period.getDays());

        System.out.println(newDate);

    }
}