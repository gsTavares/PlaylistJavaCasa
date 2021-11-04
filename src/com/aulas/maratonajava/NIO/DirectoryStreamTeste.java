/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.NIO;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 *
 * @author Marketing
 */
public class DirectoryStreamTeste {
    public static void main(String[] args) {
        Path dir = Paths.get(".");
        
        // DirectoryStream --> retorna todos os arquivos em um diretório
        
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for(Path path : stream){
                System.out.println(path.getFileName());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
