package AbstractionPackagesHandling;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment";
    }
}

public class TestCompartment {

    public static void main(String[] args) {

        Compartment[] c = new Compartment[10];

        for (int i = 0; i < c.length; i++) {

            int random = (int)(Math.random() * 4) + 1;

            switch (random) {
                case 1:
                    c[i] = new FirstClass();
                    break;
                case 2:
                    c[i] = new Ladies();
                    break;
                case 3:
                    c[i] = new General();
                    break;
                case 4:
                    c[i] = new Luggage();
                    break;
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i].notice());
        }
    }
}
