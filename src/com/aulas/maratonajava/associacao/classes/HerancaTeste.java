/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.associacao.classes;

/**
 *
 * @author Marketing
 */
public class HerancaTeste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);
        
        pessoa.imprime();
        
        Funcionario funcionario = new Funcionario("Nome teste");
        
        funcionario.setCpf("2135465");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        
        funcionario.imprime();
        System.out.println("----------------------");
        funcionario.imprimirRelatorioPagamento();
    }
}
