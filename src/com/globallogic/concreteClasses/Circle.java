package com.globallogic.concreteClasses;

import com.globallogic.interfaces.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
