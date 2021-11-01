/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Marketing
 */

// File
// FileWritter
// FileReader
// BufferedWriter
// BufferedReader

public class FileWritterTeste {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("O DevDojo é o melhor curso do Brasil");
            fw.flush();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
