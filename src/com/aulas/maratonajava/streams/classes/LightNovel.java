/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.streams.classes;

import java.util.Objects;

/**
 *
 * @author Marketing
 */
public class LightNovel {
    private String title;
    private double price;
    private Category category;

    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }
    
    public LightNovel(String title, double price, Category category){
        this.title = title;
        this.price = price;
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.title);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LightNovel other = (LightNovel) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }
    
    

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    
    
    @Override
    public String toString() {
        return "LightNovel{" + "title=" + title + ", price=" + price + ", category=" + category + '}';
    }

    
    
    
}
