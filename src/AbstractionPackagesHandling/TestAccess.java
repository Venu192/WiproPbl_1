package AbstractionPackagesHandling;

import AbstractionPackagesHandling.Foundation;

public class TestAccess {

    public static void main(String[] args) {

        Foundation f = new Foundation();

        // System.out.println(f.var1); // Error
        // System.out.println(f.var2); // Error
        // System.out.println(f.var3); // Error

        System.out.println("var4 = " + f.var4);
    }
}
