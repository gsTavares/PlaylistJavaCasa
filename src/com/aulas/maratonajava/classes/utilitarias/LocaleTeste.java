/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Marketing
 */
public class LocaleTeste {
    public static void main(String[] args) {
        // pt-BR
        Locale localeItaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");
        
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        
        System.out.println("Itália: "+df1.format(calendar.getTime()));
        System.out.println("Suiça: "+df2.format(calendar.getTime()));
        System.out.println("India: "+df3.format(calendar.getTime()));
        System.out.println("Japao: "+df4.format(calendar.getTime()));
        System.out.println("Holanda: "+df5.format(calendar.getTime()));
        
        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());
    }
}
