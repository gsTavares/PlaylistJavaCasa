/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 *
 * @author Marketing
 */
public class LocalTimeTeste {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();
        
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        
        System.out.println(timeNow.get(ChronoField.HOUR_OF_DAY));
        
        // Utilidades para relatórios
        System.out.println(LocalTime.MIN); // Meia noite
        System.out.println(LocalTime.MAX); // 23:59
    }
}
