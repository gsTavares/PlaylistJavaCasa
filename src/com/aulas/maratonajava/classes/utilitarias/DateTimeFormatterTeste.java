/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

/**
 *
 * @author Marketing
 */
public class DateTimeFormatterTeste {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2021-02-19+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_LOCAL_DATE);
        
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);
        
        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        
        System.out.println(s4);
        
        LocalDateTime parse4 = LocalDateTime.parse("2021-11-01T10:33:09.542", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);
        
        DateTimeFormatter br = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(br);
        System.out.println(formatBr);
        
        LocalDate parseBr = LocalDate.parse("19/02/2021", br);
        System.out.println(parseBr);
    }
}
