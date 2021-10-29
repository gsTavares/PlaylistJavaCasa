/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.enumeracao;

/**
 *
 * @author Marketing
 */
public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
     
        
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        
        // Busca por enumeração
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        // Retorna um atributo da enumeração passada no argumento
        System.out.println(tipoCliente.getNomeRelatorio());
        
        // Busca por atributo de enumeração
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorRelatorio("Pessoa Física");
        // Retorna a enumeração de acordo com o atributo passado no argumento
        System.out.println(tipoCliente2);
        
        
    }
}
