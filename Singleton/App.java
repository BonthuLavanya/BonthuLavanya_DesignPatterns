package com.epam2.Sinleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
