/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Marketing
 */
public class CalendarTeste {
    public static void main(String[] args) {
        
        // Calendar -> classe abstrata
        
        Calendar c = Calendar.getInstance();
        
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        
        c.add(Calendar.DAY_OF_MONTH, 0);
        c.roll(Calendar.HOUR, 14);
        Date date = c.getTime();
        System.out.println(date);
    }
}
