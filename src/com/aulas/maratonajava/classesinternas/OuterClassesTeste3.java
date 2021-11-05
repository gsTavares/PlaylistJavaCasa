/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classesinternas;

/**
 *
 * @author Marketing
 */
public class OuterClassesTeste3 {
    private String name = "Gustavo";
    
    // Classes estáticas internas só podem acessar atributos estáticos da classe top level (OuterClassesTeste3, nesse caso)
    static class Nested{
        private String lastName = "Tavares";
        void print(){
            // Erro
            // System.out.println(name);
            
            System.out.println(new OuterClassesTeste3().name +" "+ lastName);
        }
    }
    
    public static void main(String[] args) {
        Nested nested = new Nested();
        
        nested.print();
    }
}
