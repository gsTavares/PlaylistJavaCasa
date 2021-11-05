/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classesinternas;

/**
 *
 * @author Marketing
 */
public class OuterClassesTeste2 {
    
    private String nome = "Midoriya";
    void print(final String param){
        // Classes locais -> criadas dentro de um método
        // Access mod's -> final ou abstract
        
        final String lastName = "Izuku";
        
        class LocalClass{
            public void printLocal(){
                System.out.println(param);
                System.out.println(nome+" "+lastName);
            }
        }
        
        new LocalClass().printLocal();
    }
    
    public static void main(String[] args) {
        OuterClassesTeste2 outer = new OuterClassesTeste2();
        
        outer.print("Teste");
    }
}
