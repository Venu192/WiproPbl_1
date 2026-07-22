package Oops_Inheritence.Overriding_Polymorphism;

public class Fruit {

    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}
