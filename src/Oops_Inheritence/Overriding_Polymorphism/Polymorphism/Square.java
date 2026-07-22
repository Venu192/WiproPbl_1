package Oops_Inheritence.Overriding_Polymorphism.Polymorphism;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}