package OOP;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
//      myCar.brand = "big one";    brand bị private
        myCar.color = "red";

        Cat myCat = new Cat();
        myCat.sound();
        Dog myDog = new Dog();
        myDog.bark();

        Calculate calculate = new Calculate();

        calculate.shape(3,4);
        double Area = calculate.caculateArea();
        if(Area != -1){
            System.out.println( "caculate area: "+Area);
        }
        calculate.shape(2);
        double area = calculate.caculateArea();
        if(area != -1){
            System.out.println( "caculate area: "+area);
        }
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
    protected int i =1;
    public void sound() {
        System.out.println("noise");
    }
}

class Cat extends Animal {
    void getValueFromParent(){
        int value = super.i;
    }
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

class contructorClass {
    private int x;

    public contructorClass(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x){
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
    private double side;
    private double width;
    private double length;


    public void shape(int side) {
        this.side = side;
    }

    public void shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double caculateArea(){
        if (side > 0){
            return side *side;
        } else if (width >0 && length>0) {
            return width*length;
        }else{
            return -1;
        }
    }
}

class testForSuper{
    protected int i = 1;
}

class testForSuper1 extends testForSuper{
    protected int i = 2;
}

class testForSuper2 extends testForSuper1{
    void getValueFromParent(){
        int value = super.i;
    }
}


