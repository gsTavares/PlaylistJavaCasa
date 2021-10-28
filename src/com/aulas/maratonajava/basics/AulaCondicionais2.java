/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.basics;

/**
 *
 * @author Marketing
 */
public class AulaCondicionais2 {

    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 e idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 17;
        String categoria;

        if (idade < 15) {
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulta";
        }

        // Operador ternário com mais de duas condições
        categoria = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "Juvenil" : "Adulto";
        System.out.println(categoria);
    }
}
