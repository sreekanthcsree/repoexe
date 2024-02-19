package com.java8Features;

interface Shape{
    void draw();
}

class Rectangle implements Shape{

    public void draw(){
        System.out.println("This is Rectangle Class : draw() method");
    }
}

class Square implements Shape{

    public void draw(){
        System.out.println("This is Square Class : draw() method");
    }
}

class Circle implements Shape{

    public void draw(){
        System.out.println("This is Circle Class : draw() method");
    }
}

public class LambdaExample {

    public static void main(String[] args) {

        /*Shape rectangle = () -> System.out.println("This is Rectangle Class : draw() method");
        rectangle.draw();
        Shape square = () -> System.out.println("This is Square Class : draw() method");
        square.draw();
        Shape circle = () -> System.out.println("This is Circle Class : draw() method");
        circle.draw();*/

        System.out.println("================================================");

        print(() -> System.out.println("This is Rectangle Class : draw() method"));
        print(() -> System.out.println("This is Square Class : draw() method"));
        print(() -> System.out.println("This is Circle Class : draw() method"));
    }
  public static void  print(Shape shape){
     shape.draw();
    }
}
