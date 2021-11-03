/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Marketing
 */
public class BufferedWriterTeste {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true); 
                BufferedWriter bfw = new BufferedWriter(fw)){
            bfw.write("O devDojo é o melhor curso do Brasil");
            bfw.newLine();  
            bfw.flush();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
