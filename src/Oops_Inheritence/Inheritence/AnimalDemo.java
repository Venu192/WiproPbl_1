package Oops_Inheritence.Inheritence;

public class AnimalDemo {

    public static void main(String[] args) {

        Animal a = new Animal();

        System.out.println("Animal Class:");
        a.eat();
        a.sleep();

        System.out.println();

        Bird b = new Bird();

        System.out.println("Bird Class:");
        b.eat();
        b.sleep();
        b.fly();
    }
}
