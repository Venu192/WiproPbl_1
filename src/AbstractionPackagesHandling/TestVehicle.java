package AbstractionPackagesHandling;

abstract class Vehicle {

    public abstract String getModelName();

    public abstract String getRegistrationNumber();

    public abstract String getOwnerName();
}

class Hero extends Vehicle {

    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "AP39AB1234";
    }

    public String getOwnerName() {
        return "Sajid";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio is ON");
    }
}

class Honda extends Vehicle {

    public String getModelName() {
        return "Honda City";
    }

    public String getRegistrationNumber() {
        return "AP39CD5678";
    }

    public String getOwnerName() {
        return "Rahul";
    }

    public int getSpeed() {
        return 120;
    }

    public void cdplayer() {
        System.out.println("CD Player is ON");
    }
}

public class TestVehicle {

    public static void main(String[] args) {

        Hero hero = new Hero();

        System.out.println("-----Hero-----");
        System.out.println("Model Name : " + hero.getModelName());
        System.out.println("Registration Number : " + hero.getRegistrationNumber());
        System.out.println("Owner Name : " + hero.getOwnerName());
        System.out.println("Speed : " + hero.getSpeed());
        hero.radio();

        System.out.println();

        Honda honda = new Honda();

        System.out.println("-----Honda-----");
        System.out.println("Model Name : " + honda.getModelName());
        System.out.println("Registration Number : " + honda.getRegistrationNumber());
        System.out.println("Owner Name : " + honda.getOwnerName());
        System.out.println("Speed : " + honda.getSpeed());
        honda.cdplayer();
    }
}
