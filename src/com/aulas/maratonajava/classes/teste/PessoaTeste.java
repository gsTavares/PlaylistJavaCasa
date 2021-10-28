/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.teste;

import com.aulas.maratonajava.classes.Pessoa;

/**
 *
 * @author Marketing
 */
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("João");
        pessoa.setIdade(23);
        // pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
