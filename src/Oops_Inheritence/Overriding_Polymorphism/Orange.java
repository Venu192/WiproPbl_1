package Oops_Inheritence.Overriding_Polymorphism;

public class Orange extends Fruit {

    public Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    public void eat() {
        System.out.println("Orange tastes Sour");
    }
}
