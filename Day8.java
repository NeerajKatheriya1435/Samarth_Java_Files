

//abstract class Car{
//
//    abstract void speed();
//    abstract void breakCar();
//    abstract void seat();
//
//    void displayDetails() {
//        System.out.println("Normal Methods");
//    }
//}

//interface Car{
//
//    void speed();
//    void breakCar();
//    void seat();
//
//    default void displayDetails() {
//        System.out.println("Normal Methods");
//    }
//    static void displayDetails1() {
//        System.out.println("Normal Methods");
//    }
//}
//
//class Fortuner implements Car{
//
//    @Override
//    public void speed(){
//        System.out.println("Speed is good");
//    }
//    @Override
//    public void breakCar(){
//        System.out.println("Breaking the car");
//    };
//    @Override
//    public void seat(){
//        System.out.println("Seat is Available");
//    };
//
//    void sound(){
//        System.out.println("Soud is playing");
//    }
//}

//interface Animal {
//    void eat();
//}
//interface Dog extends Animal {
//    void bark();
//}
//
//class PetDog implements  Dog{
//    public void eat(){
//        System.out.println("Dog is eating");
//    }
//    public void bark(){
//        System.out.println("Dog is barking");
//    }
//
//    void extraMethod(){
//        System.out.println("This is Extra");
//    }
//}

// First interface
interface Shape {
    void draw();
}
// Second interface
interface Color {
    void fillColor();
}
// Third interface
interface Resizable {
    void resize();
}
// One class implements all interfaces
class Circle implements Shape, Color, Resizable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    public void fillColor() {
        System.out.println("Filling Circle with Red color");
    }
    public void resize() {
        System.out.println("Resizing the Circle");
    }
}


public class Day8 {
    public static void main(String[] args) {

//        Fortuner f1=new Fortuner();
//        f1.sound();
//        f1.speed();

//        PetDog p1=new PetDog();
//        p1.bark();

//        Circle c1=new Circle();
//        c1.draw();
//        c1.fillColor();
//        Circle c1=new Color();Circle c1=new Color();

        Shape s1=new Circle();
//        s1.draw();
//        s1.fillColor();


    }
}
