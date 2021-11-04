/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Marketing
 */
public class RelativizeTeste {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/gustavo");
        Path clazz = Paths.get("/home/gustavo/devdojofoda/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        
        System.out.println(pathToClazz);
        
        Path absoluto1 = Paths.get("/home/gustavo");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/gustavo/devdojofoda/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2021921");
        
        System.out.println("1 "+absoluto1.relativize(absoluto3));
        System.out.println("2 "+absoluto3.relativize(absoluto1));
        System.out.println("3 "+absoluto1.relativize(absoluto2));
        System.out.println("4 "+relativo1.relativize(relativo2));
        
        // Lança exceção
        System.out.println("5 "+absoluto1.relativize(relativo1));
    }
}
