/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.generics.teste;

/**
 *
 * @author Marketing
 */

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando doguinho");
    }
    
}

class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
    
}

public class WildcardTeste {
    public static void main(String[] args) {
        
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        Animal[] animals = {new Gato(), new Cachorro()};
        
        printConsulta(cachorros);
        printConsulta(gatos);
        System.out.println("---------");
        printConsulta(animals);
    }
    
    private static void printConsulta(Animal[] animals){
        for(Animal animal : animals){
            animal.consulta();
        }
    }
}
