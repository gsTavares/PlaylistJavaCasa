 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.associacao.classes;

/**
 *
 * @author Marketing
 */
public class HerancaTeste2 {
    // Sequência de inicialização com herança
    // 0 -> Bloco de inicalização estático da super classe é executado quando a JVM carregar a classe pai
    // 1 -> Bloco de inicalização estático da subclasse é executado quando a JVM carregar a classe filha
    // 2 -> Alocado espaço em memória para o objecto da super classe
    // 3 -> Cada um dos atributos de super classe são inicializados com valores default ou o que for passado
    // 4 -> Bloco de incialização da super classe é executado na ordem que aparecem
    // 5 -> Construtor da super classe é executado
    // 6 -> Alocado espaço em memória para o objecto da subclasse
    // 7 -> Cada um dos atributos de subclasse são inicializados com valores default ou o que for passado
    // 8 -> Bloco de incialização da subclasse é executado na ordem que aparecem
    // 9 -> Construtor da subclasse é executado
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
