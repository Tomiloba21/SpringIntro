/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navin.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component // when the Battery class is called it instantiates  the object (Battery)
// the scope annotation symbolizes the use of using more than 1
// it can take two ; singleton or prototype
@Scope(value = "singleton")
public class Car  implements Vehicle{
    @Autowired // this annotation allows spring(java ) to search for the class automatically
    @Qualifier("battery") //Note : it uses the small letter word to search for the class (Battery)
    private Battery battery;

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

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
        battery.compile();
    }
}
