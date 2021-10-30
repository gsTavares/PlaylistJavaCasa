/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 *
 * @author Marketing
 */
public class LocalDateTeste {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.JANUARY , 30);
        LocalDate now = LocalDate.now();
        
        now = now.plusWeeks(4);
        
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);
        System.out.println(now);
        
    }
}
