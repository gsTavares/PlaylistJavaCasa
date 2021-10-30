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
public class NumberFormatTeste2 {
    public static void main(String[] args) {
        
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[3];
        
        // Formatação de moedas com locale
        
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeIT);
        
        double valor = 1000.2130;
        
        for(NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor)); 
        }
        
        String valorString = "R$ 1000,2130";
        
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
