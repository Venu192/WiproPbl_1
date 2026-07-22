package Oops_Inheritence.Overriding_Polymorphism;

public class FruitDemo {

    public static void main(String[] args) {

        Fruit f = new Fruit("Mango", "Sweet", "Large");
        Apple a = new Apple();
        Orange o = new Orange();

        f.eat();
        a.eat();
        o.eat();
    }
}
