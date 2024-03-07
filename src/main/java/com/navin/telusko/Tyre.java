/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navin.telusko;


/**
 *
 * @author admin
 */

public class Tyre {
    
    private String brand;

    public String getBrand() {
       
        return brand;
    }

//    public Tyre(String brand) {
//        super();
//        this.brand = brand;
//    }

    public void setBrand(String brand) {
        //setter Injection
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre is working.....";
    }
    
    
    
}
