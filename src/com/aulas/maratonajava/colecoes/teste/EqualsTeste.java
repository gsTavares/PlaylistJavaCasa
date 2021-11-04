/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import com.aulas.maratonajava.colecoes.dominio.Smartphone;

/**
 *
 * @author Marketing
 */
public class EqualsTeste {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
        
        // System.out.println(s1.equals(s2));
        // Retorna falso, pois s1 e s2 apontam pra dois objetos distintos,
        // ainda que eles contenham os mesmos valores
        
        // Comparando dois objetos pelo serial number
        System.out.println(s1.equals(s2));
        System.out.println(s1.getSerialNumber().equals(s2.getSerialNumber()));
    }
}
