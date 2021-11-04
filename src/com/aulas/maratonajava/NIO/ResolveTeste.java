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
public class ResolveTeste {
    public static void main(String[] args) {
        Path dir = Paths.get("home/gustavo");
        Path arquivo = Paths.get("dev/arquivo.txt");
        
        // Junção de diretórios
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);
        
        Path absoluto = Paths.get("/home/gustavo");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");
        
        System.out.println("1- "+absoluto.resolve(relativo));
        System.out.println("2- "+absoluto.resolve(file));
        System.out.println("3- "+relativo.resolve(absoluto));
        System.out.println("4- "+relativo.resolve(file));
        System.out.println("5- "+file.resolve(absoluto));
        System.out.println("6- "+file.resolve(relativo));
    }
}
