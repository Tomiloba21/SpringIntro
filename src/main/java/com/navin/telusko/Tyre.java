/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navin.telusko;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

/**
 *
 * @author admin
 */
@Component
public class Tyre {

    private String brand;

    public String getBrand() {
       
        return brand;
    }
//    @Autowired
//    public Tyre(String brand) {
//        this.brand = brand;
//    }

    public void setBrand(String brand) {
        //setter Injection instead of using the constructor
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre is working.....";
    }
    
    
    
}
