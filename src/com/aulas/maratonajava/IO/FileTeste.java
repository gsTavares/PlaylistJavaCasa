/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.IO;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Marketing
 */
public class FileTeste {
    public static void main(String[] args) {
        
        // IO - Arquivos
        // Classe file --> new File("caminho+nomeDoArquivo.extensão")
        // createNewFile() -> cria o arquivo
        // delete() -> deleta o arquivo
        // exists() -> verifica se o arquivo existe
        // getPath() -> recupera o caminho do arquivo
        // getAbsolutePath -> recupera o caminho absoluto do arquivo
        // isDirectory() -> verifica se é um diretório
        // isFile() -> verifica se é um arquivo
        // isHidden() -> verifica se é um arquivo oculto
        // lastModified() -> última modificação (retorna um long... utilizar junto o pacote java.time)
        
        File file = new File("file.txt");
        try {
            
            boolean isCreated = file.createNewFile();
            System.out.println("Created "+isCreated);
            System.out.println("path "+file.getPath());
            System.out.println("path "+file.getAbsolutePath());
            
            boolean exists = file.exists();
            
            if(exists){
                System.out.println("Deleted "+file.delete());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
