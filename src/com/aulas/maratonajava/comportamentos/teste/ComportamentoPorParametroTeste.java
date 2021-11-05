/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.comportamentos.teste;

import com.aulas.maratonajava.comportamentos.dominio.Car;
import com.aulas.maratonajava.comportamentos.interfaces.CarPredicate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Marketing
 */
public class ComportamentoPorParametroTeste {

    public static void main(String[] args) {
        
        List<Car> cars = new ArrayList<>();
        
        cars.add(new Car("green", 2011));
        cars.add(new Car("black", 1998));
        cars.add(new Car("red", 2019));
        
        // Parametrização de comportamentos com lambda expression
        List<Car> greenCars = filter(cars, (Car car) -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, (Car car) -> car.getColor().equals("red"));
        List<Car> yearBefore = filter(cars, (Car car) -> car.getYear() < 2015);
        
//        List<Car> greenCars = filter(cars, new CarPredicate(){
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//            
//        });
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBefore);
        

    }
    
    // Generalizando ainda mais o método
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();

        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }

        return filteredList;
    }
}
