/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Map;

/**
 *
 * @author Marketing
 */
public class ZoneTeste {
    public static void main(String[] args) {
        
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        
        ZonedDateTime zoneDateTime = now.atZone(tokyoZone);
        System.out.println(zoneDateTime);
        
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);
        
        
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        
        
        ZoneOffset manaus = ZoneOffset.of("-04:00");
        OffsetDateTime manausOffset = now.atOffset(manaus);
        System.out.println(manausOffset);
        OffsetDateTime manausOffset2 = OffsetDateTime.of(now, manaus);
        System.out.println(manausOffset2);
        
        OffsetDateTime manausOffset3 = nowInstant.atOffset(manaus);
        System.out.println(manausOffset3);
        
        JapaneseDate jpDate = JapaneseDate.from(LocalDate.now());
        System.out.println(jpDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
