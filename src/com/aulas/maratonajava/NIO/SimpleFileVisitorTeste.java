/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.NIO;


import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFiles extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;

    }

}

/**
 *
 * @author Marketing
 */
public class SimpleFileVisitorTeste {

    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        
        // Percorre todas as pastas de um diretório e, a partir de uma lógica, acessa todos
        // os arquivos de todas as pastas desse diretório
        Files.walkFileTree(root, new ListJavaFiles());
    }
}
