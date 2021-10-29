/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exceptions;

/**
 *
 * @author Marketing
 */
public class RuntimeExceptionTeste {
    // Checked e Unchecked
    // Checked: se não tratadas, gera um erro de compilação (nem compila/executa)
    // Unchecked: o problema sou eu '-'(exemplos: nullPointer, outFormat...)
    
    
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(nums[3]);
    }
}
