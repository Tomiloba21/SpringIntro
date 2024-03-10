/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navin.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component
public class Bike implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Bike" + "...........................Two "+tyre.toString());
    }

    @Autowired
    private Tyre tyre;

    
}
