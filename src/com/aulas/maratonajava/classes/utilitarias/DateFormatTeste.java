/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

import java.text.DateFormat;
import java.util.Calendar;

/**
 *
 * @author Marketing
 */
public class DateFormatTeste {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        
        DateFormat[] df = new DateFormat[7];
        
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);
        
        for(DateFormat dateFormat : df){
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
