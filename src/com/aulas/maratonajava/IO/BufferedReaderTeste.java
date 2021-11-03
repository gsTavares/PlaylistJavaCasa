/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Marketing
 */
public class BufferedReaderTeste {
    public static void main(String[] args) {
        File file = new File("file.txt");
        
        try (FileReader fr = new FileReader(file);
                BufferedReader bfr = new BufferedReader(fr)){
                
                String linha;
                while((linha = bfr.readLine()) != null){
                    System.out.println(linha);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
