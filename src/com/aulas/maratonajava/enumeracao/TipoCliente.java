/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.enumeracao;

/**
 *
 * @author Marketing
 */
// Enumeração --> criada para impor restrições utilizando valores constantes
// Exemplo: todo cliente tem um tipo, que obrigatoriamente deve ser pessoa física
// ou pessoa jurídica
// Classes enum ajudam a tornar dos dados mais consistentes
public enum TipoCliente {

    // Declaração
    // NOME_DA_ENUMERAÇÃO(atributos)
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    // Valor numérico relacionado ao tipo da pessoa
    private int valor;
    // Relatório para exibição de acordo com o tipo da pessoa
    private String nomeRelatorio;

    private TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorRelatorio(String nomeRelatorio) {

        // Laço que percorre os valores de cada enumeração
        for (TipoCliente tipoCliente : values()) {
            // Se o valor passado por parâmetro for igual ao valor do atributo de relatório de
            // alguma enumeração, essa enumeração é retornada
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }

        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return this.valor;
    }

}
