package com.globallogic.concreteClasses;

import com.globallogic.interfaces.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
