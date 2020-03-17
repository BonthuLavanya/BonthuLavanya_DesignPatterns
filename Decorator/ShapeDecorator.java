package com.epam2.Decorator;

public abstract class ShapeDecorator implements Shape
{
  public Shape decoratedShape;
  public ShapeDecorator(Shape decoratedShape)
  {
    this.decoratedShape = decoratedShape;
  }
  public void draw()
  {
    decoratedShape.draw();
  }	
}