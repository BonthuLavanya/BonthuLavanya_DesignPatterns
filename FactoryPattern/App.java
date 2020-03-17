package com.epam2.FactoryPattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ShapeFactory shapeFactory = new ShapeFactory();
        Shape s1 = shapeFactory.getShape("RECTANGLE");
        s1.draw();
        Shape s2 = shapeFactory.getShape("SQUARE");
        s2.draw();
    }
}
