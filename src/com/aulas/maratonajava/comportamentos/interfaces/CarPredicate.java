/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aulas.maratonajava.comportamentos.interfaces;

import com.aulas.maratonajava.comportamentos.dominio.Car;

/**
 *
 * @author Marketing
 */

@FunctionalInterface

// Interfaces funcionais possuem apenas um método abstrato
public interface CarPredicate {
    // lambdas são anônimas, funções
    // Objetivo: consistência
    boolean test(Car car);
    
    // Sintaxe lambda
    // (parâmetro) -> <expressão>
    // (Car car) -> car.getColor.equals("green")
}
