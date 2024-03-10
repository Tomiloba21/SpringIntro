/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navin.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component
@Scope(value = "prototype")
//@scope(value= )
public class Car  implements Vehicle{
    @Autowired
    private Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
    
    
    @Override
    public void drive(){
        System.out.println("car" + "............................Four "+tyre.toString());
    }
}
