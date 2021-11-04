/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 *
 * @author Marketing
 */
public class BasicFileAttributesTeste2 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/new.txt");
        
        BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);
        
        FileTime cTime = bfa.creationTime();
        FileTime lmTime = bfa.lastModifiedTime();
        FileTime laTime = bfa.lastAccessTime();
        
        System.out.println("Creation Time "+cTime);
        System.out.println("Last Modified "+lmTime);
        System.out.println("Last access "+laTime);
        System.out.println("------------------------------");
        // Métodos de alteração
        BasicFileAttributeView faw = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        
        FileTime newLmTime = FileTime.fromMillis(System.currentTimeMillis());
        
        faw.setTimes(laTime, newLmTime , cTime);
        
        cTime = faw.readAttributes().creationTime();
        lmTime = faw.readAttributes().lastModifiedTime();
        laTime = faw.readAttributes().lastAccessTime();
        
        System.out.println("Creation Time "+cTime);
        System.out.println("Last Modified "+lmTime);
        System.out.println("Last access "+laTime);
    }
}
