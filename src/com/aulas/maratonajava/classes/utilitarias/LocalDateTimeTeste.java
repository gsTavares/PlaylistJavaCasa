/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author Marketing
 */
public class LocalDateTimeTeste {
    public static void main(String[] args) {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);
        
        // LocalDate/Time.parse(String) --> converte uma string em LocalDate ou LocalTime
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("09:45:00");
        
        System.out.println(date);
        System.out.println(time);
        
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        
        System.out.println(ldt1);
        System.out.println(ldt2);
        
        
    }
}
