package com.navin.telusko;

import org.springframework.stereotype.Component;

@Component
public class Battery {
    // adding properties
    private String brand;
    private int id;


    public void compile(){
        System.out.println("Compiling ......");
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "brand='" + brand + '\'' +
                ", id=" + id +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
