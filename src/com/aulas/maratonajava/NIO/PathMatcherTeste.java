/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.NIO;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 *
 * @author Marketing
 */
public class PathMatcherTeste {
    public static void main(String[] args) {
        Path p1 = Paths.get("pasta/subpasta/file.bkp");
        Path p2 = Paths.get("pasta/subpasta/file.txt");
        Path p3 = Paths.get("pasta/subpasta/file.java");
        
        // false
        matches(p1, "glob:*.bkp");
        
        // busca por extensão
        matches(p1, "glob:**/*.bkp");
        
        // busca por agrupamento de extensões
        matches(p1, "glob:**/*.{bkp,txt,java}");
        matches(p2, "glob:**/*.{bkp,txt,java}");
        matches(p3, "glob:**/*.{bkp,txt,java}");
        
        // busca por quantidade de caracteres da extensão
        matches(p1, "glob:**/*.????");
        matches(p2, "glob:**/*.????");
        matches(p3, "glob:**/*.????");
        
        matches(p1, "glob:**/*.file.???");
        matches(p2, "glob:**/*.file.???");
        matches(p3, "glob:**/*.file.???");
    }
    
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        
        System.out.println(glob +": "+ matcher.matches(path));
    }
}
