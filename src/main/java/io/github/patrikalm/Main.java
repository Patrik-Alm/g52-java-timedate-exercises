package io.github.patrikalm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();


        System.out.println(today.format(DateTimeFormatter.ofPattern("eeee dd MMMM")));
    }
}