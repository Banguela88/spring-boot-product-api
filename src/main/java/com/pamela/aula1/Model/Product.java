package com.pamela.aula1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity (name = "Product")
@Table (name = "Product")


public class Product {

    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)

    private Integer id;
    private String name;
    private long price;
    public Product() {
        
    }

    public Product (Integer id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;

    } 
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }

}
