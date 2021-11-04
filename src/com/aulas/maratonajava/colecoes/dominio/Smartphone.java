/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.dominio;

/**
 *
 * @author Marketing
 */
public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }
    
    // Sobrescrita do método equals()

    // Regras:
    // Reflexão -> x.equals(x) -> sempre true pra tudo que for != null
    // Simetria -> sendo x e y, ambos != null, se x.equals(y) == true, logo y.equals(x) == true
    // Transitividade -> para x, y, z, ambos != null, se x.equals(y) == true e y.equals(z) == true e x.equals(z) == true, logo y.equals(z) == true
    // Consistência  -> x.equals(x) sempre retorna true se x != null
    // Para x != null, x.equals(null) == false
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        
        if(this == obj){
            return true;
        }
        
        if(this.getClass() != obj.getClass()){
            return false;
        }
        
        Smartphone smartphone = (Smartphone) obj;
        
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
        
    }

    // Regras
    
    // Se x.equals(y) == true, y.hashCode(x) == x.hashCode();
    // y.hashCode == x.hashCode, não necessáriamente y.equals(x) retorna true;
    // se x.equals(y) == false, hash code diferente;
    // y.hashCode() != x.hashCode, x.equals(y) == false;
    
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }
    
    
    

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
