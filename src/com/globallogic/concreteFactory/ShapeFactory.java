package com.globallogic.concreteFactory;

import com.globallogic.concreteClasses.Circle;
import com.globallogic.concreteClasses.Rectangle;
import com.globallogic.concreteClasses.Square;
import com.globallogic.interfaces.Shape;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}