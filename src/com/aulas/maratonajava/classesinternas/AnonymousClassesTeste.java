/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classesinternas;

/**
 *
 * @author Marketing
 */

class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}

class Cachorro extends Animal{

    @Override
    public void walk() {
        System.out.println("Cachorro walking");
    }
    
}

public class AnonymousClassesTeste {
    public static void main(String[] args) {
        // Classes anônimas --> existem por um tempo breve não podem ser reutilizadas
        // Inicialização --> Objeto objeto = new Objeto(){codigo};
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Waling in the shadows");
            }
            
            public void jump(){
                
            }
            
        };
        
        // Se existem métodos novos dentro da classe anônima, que não pertençam ao objeto original,
        // eles não podem ser acessados. Eles só são acessíveis dentro da classe anõnima
        
        animal.walk();
        
    }
}
