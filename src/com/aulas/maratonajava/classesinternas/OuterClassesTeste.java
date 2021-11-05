/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classesinternas;

/**
 *
 * @author Marketing
 */
public class OuterClassesTeste {
    
    private String name = "Monkey D. Luffy";
    
    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTeste.this);
            
            // this sempre faz referência ao objeto que ele se encontra
        }
    }
    
    public static void main(String[] args) {
        OuterClassesTeste outerClass = new OuterClassesTeste();
        Inner inner = outerClass.new Inner();
        
        Inner inner2 = new OuterClassesTeste().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
