/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.generics.teste;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marketing
 */
public class WildcardTeste2 {

    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();
        List<Gato> gatos = new ArrayList<>();

        cachorros.add(new Cachorro());
        cachorros.add(new Cachorro());

        gatos.add(new Gato());
        gatos.add(new Gato());

        // printConsulta(cachorros);
        // Erro de compilação -> Nas listas, o Java não entende que uma lista <Animal> pode receber uma lista<Cachorro> ou lista<Gato>
        // Apesar de ser possível adicionar instâncias filhas dentro de uma lista<Animal>
    }

    
    // List<? extends ClassePai> --> aceita somente as listas herdadas da Classe Pai;
    // 1 -> Não é possível adicionar nada na lista, pois só é aceito um tipo de classe filha
    // Exemplo, se uma lista de gatos é recebida como parâmetro, cachorros não podem ser adicionados
    
    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

       
    }
    
    // List<? super ClassePai> --> Nesse caso, a lista aceita quaisquer outras listas que herdam o construtor da classe pai 
    // e garante que elas sempre vão ser do tipo animal
    private static void printConsultaAnimal(List<? super Animal> animals){
        Animal animal = new Cachorro();
        Animal animal2 = new Gato();
        
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
