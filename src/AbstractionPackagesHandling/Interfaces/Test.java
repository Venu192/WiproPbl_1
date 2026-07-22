package AbstractionPackagesHandling.Interfaces;

interface Playable {
    void play();
}

class Veena implements Playable {

    public void play() {
        System.out.println("Playing Veena");
    }
}

class Saxophone implements Playable {

    public void play() {
        System.out.println("Playing Saxophone");
    }
}

public class Test {

    public static void main(String[] args) {

        // a. Create Veena object
        Veena v = new Veena();
        v.play();

        // b. Create Saxophone object
        Saxophone s = new Saxophone();
        s.play();

        // c. Using Playable reference
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}
