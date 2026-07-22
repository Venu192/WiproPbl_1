package AbstractionPackagesHandling;

abstract class Vehicle {

    public abstract String getModelName();

    public abstract String getRegistrationNumber();

    public abstract String getOwnerName();
}

class Logan extends Vehicle {

    public String getModelName() {
        return "Logan";
    }

    public String getRegistrationNumber() {
        return "AP39AA1111";
    }

    public String getOwnerName() {
        return "Sajid";
    }

    public int speed() {
        return 140;
    }

    public void gps() {
        System.out.println("GPS is ON");
    }
}

class Ford extends Vehicle {

    public String getModelName() {
        return "Ford";
    }

    public String getRegistrationNumber() {
        return "AP39BB2222";
    }

    public String getOwnerName() {
        return "Rahul";
    }

    public int speed() {
        return 160;
    }

    public void tempControl() {
        System.out.println("Air Conditioner is ON");
    }
}

public class TestFourWheeler {

    public static void main(String[] args) {

        Logan l = new Logan();

        System.out.println("----- Logan -----");
        System.out.println("Model Name : " + l.getModelName());
        System.out.println("Registration Number : " + l.getRegistrationNumber());
        System.out.println("Owner Name : " + l.getOwnerName());
        System.out.println("Speed : " + l.speed());
        l.gps();

        System.out.println();

        Ford f = new Ford();

        System.out.println("----- Ford -----");
        System.out.println("Model Name : " + f.getModelName());
        System.out.println("Registration Number : " + f.getRegistrationNumber());
        System.out.println("Owner Name : " + f.getOwnerName());
        System.out.println("Speed : " + f.speed());
        f.tempControl();
    }
}