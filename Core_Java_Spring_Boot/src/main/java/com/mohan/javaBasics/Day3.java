package com.mohan.javaBasics;

public class Day3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        System.out.println();
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: "+calc.add(3,5));
        System.out.println("Sum of two doubles: "+calc.add(3.5,2.1));
        System.out.println("Sum of three integers: "+calc.add(2,4,6));

        System.out.println();

       new Circle(5).calculateArea();
       new Rectangle(4,6).calculateArea();
    }
}


class Dog extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Bark");

    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow");

    }

}

 class Calculator {

    public  int add(int a, int b){
        return a+b;
    }

    public  double add(double a, double b){
        return a+b;
    }

    public  int add(int a, int b ,int c){
        return a+b+c;
    }
}

abstract class Shape  {
    abstract void calculateArea();
    void display(){
        System.out.println("Calculating Area");
    }
}

class  Circle extends Shape  {

    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Calculating Area");
        System.out.println("Area of Circle: "+(Math.PI * radius * radius));
    }
}

class  Rectangle extends Shape{
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea(){
        System.out.println("Calculating Area");
        System.out.println("Area of Rectangle: "+length*breadth);
    }
}
