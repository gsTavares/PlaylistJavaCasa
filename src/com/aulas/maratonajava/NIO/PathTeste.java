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
public class PathTeste {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Marketing\\Documents\\NetBeansProjects\\maratonajava2\\PlaylistJavaCasa\\pasta2\\file.txt");
        Path p2 = Paths.get("C:\\Users\\Marketing\\Documents\\NetBeansProjects\\maratonajava2,", "\\PlaylistJavaCasa\\pasta2\\file.txt");
        Path p3 = Paths.get("C:", "\\Users\\Marketing\\Documents\\NetBeansProjects\\maratonajava2", "\\PlaylistJavaCasa\\pasta2\\file.txt");
        Path p4 = Paths.get("C:", "Users", "Marketing", "Documents", "NetBeansProjects", "maratonajava2", "PlaylistJavaCasa", "pasta2", "file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
        
        
    }
}
