/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dow = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 1;
        
        switch(dow){
            
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY: 
                addDays = 3; 
                break;
            case SATURDAY: 
                addDays = 2; 
                break;
            default: 
                addDays = 1;
        }
        
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }

}

/**
 *
 * @author Marketing
 */
public class TemporalAdjusterTeste {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        
        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        
        now = LocalDate.now().withDayOfMonth(8).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        
        now = LocalDate.now().withDayOfMonth(5).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        
        now = LocalDate.now().withDayOfMonth(6).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        
        now = LocalDate.now().withDayOfMonth(7).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
