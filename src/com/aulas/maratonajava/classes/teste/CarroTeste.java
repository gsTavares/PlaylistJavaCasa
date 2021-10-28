/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.teste;

import com.aulas.maratonajava.classes.Carro;

/**
 *
 * @author Marketing
 */
public class CarroTeste {

    public static void main(String[] args) {
        
        Carro.setVelocidadeLimite(180);
        
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedez", 275);
        Carro c3 = new Carro("Audi", 290);
        
        
        
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }

}
