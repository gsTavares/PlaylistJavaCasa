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
public class NormalizingTeste {
    public static void main(String[] args) {
        String diretorioProjeto = "home/gustavo/dev";
        String arquivoTxt = "../../arquivo.txt";
        
        Path p1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());
        
        Path p2 = Paths.get("/home/./gustavo/./dev/");
        System.out.println(p2);
        System.out.println(p2.normalize());
    }
}
