/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Marketing
 */
public class DurationTeste {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime afterTwoYears = LocalDateTime.now().plusYears(2);
        
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinusSevenHours = LocalTime.now().minusHours(7);
        
        // Durantion --> cálculo entre datas
        // Não aceita LocalDate, pois ela não trabalha com segundos
        
        Duration d1 = Duration.between(now, afterTwoYears);
        Duration d2 = Duration.between(timeNow, timeMinusSevenHours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(3);
        Duration d6 = Duration.of(3, ChronoUnit.HOURS);
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        
        
    }
}
