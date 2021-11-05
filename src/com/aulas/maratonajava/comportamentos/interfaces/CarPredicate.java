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
public interface CarPredicate {
    boolean test(Car car);
}
