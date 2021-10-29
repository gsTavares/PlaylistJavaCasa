/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.enumeracao;

/**
 *
 * @author Marketing
 */
public enum TipoPagamento {
    DEBITO {
        // Métodos podem ser criados dentro das enumerações
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.1;
        }
    },
    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.05;
        }
    };

    // Método abstrato -> define somente o cabeçalho do método
    // O seu comportamento está sendo definido pelas enumerções acima, que estão sobrescrevendo-o
    public abstract double calcularDesconto(double valor);
}
