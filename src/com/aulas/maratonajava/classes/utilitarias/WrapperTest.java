/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

/**
 *
 * @author Marketing
 */
public class WrapperTest {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'a';
        boolean booleanP = false;
        
        // Wrappers -> classes que encapsulam os tipos primitivos
        // Úteis para passagem de parâmetro por referência
        
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // Boxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100.0;
        Character charW = 'a';
        Boolean booleanW = false;
        
        int i = intW; // Unboxing
        Integer intW2 = Integer.parseInt("1"); // Transforma uma string em integer
        
        // Quase todos os wrappers possuem esse método de conversão
        
        // Alguns métodos usando Character
        
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('!'));
        System.out.println(Character.isLowerCase('!'));
        System.out.println(Character.toUpperCase('!'));
        

    }
}
