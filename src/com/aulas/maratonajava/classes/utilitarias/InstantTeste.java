/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

import java.time.Instant;
import java.time.LocalDateTime;

/**
 *
 * @author Marketing
 */
public class InstantTeste {
    public static void main(String[] args) {
        
        // Trabalham com nano-segundos
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        
        System.out.println(Instant.ofEpochSecond(3, 0));
        System.out.println(Instant.ofEpochSecond(3, 1000000000));
    }
}
