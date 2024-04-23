package OOP;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
//        myCar.brand = "big one";    brand bị private
        myCar.color = "red";

        Cat myCat = new Cat();
        myCat.sound();
        Dog myDog = new Dog();
        myDog.bark();



        Calculate calculate = new Calculate();
        calculate.shape(3,4);
        calculate.shape(2);
    }
}
class Car {
    protected String color;
    private String brand;
    private String model;

    public void Brand(String brand) {
        System.out.println(brand);
    }
}



class Animal {
    public void sound() {
        System.out.println("noise");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("mew");
    }
}

class Dog {
    public void bark() {
        System.out.println("bark ");
    }
}


class MyClassHaveContructor {
    private int x;

    public MyClassHaveContructor(int x) {
        this.x = x;
    }

    public void printX() {
        System.out.println(this.x);
    }
}

class Parent {
    protected int x;

    public Parent(int x) {
        this.x = x;
    }
}

class Child extends Parent {
    private int y;

    public Child(int x, int y) {
        super(x);
        this.y = y;
    }

    public void printX() {
        System.out.println(super.x);
    }
}

abstract class Shape{
     abstract double dientich();
}

class hinhhoc extends Shape{
    private int side = 1;

    @Override
    double dientich() {
        return side * side;
    }
}


class Calculate {
    private int side;
    private int width;
    private int length;


    public void shape(int side) {
        this.side = side;
    }

    public void shape(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

