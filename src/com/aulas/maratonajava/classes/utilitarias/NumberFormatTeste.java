/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author Marketing
 */
public class NumberFormatTeste {
    public static void main(String[] args) {
        
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[3];
        
        // Formatação de números com locale
        
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeIT);
        
        double valor = 10000.213;
        
        for(NumberFormat numberFormat: nfa){
            // Máximo de casas decimais
            System.out.println(numberFormat.getMaximumFractionDigits());
            
            // Número formatado
            System.out.println(numberFormat.format(valor)); 
        }
        
        String valorString = "1000,2130";
        
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
