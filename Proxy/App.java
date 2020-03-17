package com.epam2.Proxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Image image = new ProxyImage("test_10mb.jpg");
        image.display(); 
        System.out.println("");
        image.display();
    }
}
