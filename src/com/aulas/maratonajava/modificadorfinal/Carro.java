/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.modificadorfinal;

/**
 *
 * @author Marketing
 */

// Comportamento do modificador final em classes -> não deixa que a mesma seja extendida
// e que os seus métodos não sejam sobrescritos

// Exemplo de classe com esse modificador -> String

public /** final **/ class Carro {
    private String nome;
    
    // Modificador final -> torna o atributo uma constante (deve ser inicializada e não pode ser alterada)
    // Padrão de nomenclatura: public static final <tipo_primitivo> NOME_CONSTANTE = <valor>;
    
    public static final double VELOCIDADE_LIMITE = 250;
    
    // Modificador final em variáveis de referência
    // Significa que a referência que a variável recebe não poderá ser alterada
    
    public final Comprador COMPRADOR = new Comprador();
    
    // Quando aplicado em um método, o final bloqueia a sobrescrita do mesmo,
    // ainda que ele seja instanciado dentro de uma subclasse
    public final void imprime(){
        System.out.println(this.nome);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    
    
    
    
}
