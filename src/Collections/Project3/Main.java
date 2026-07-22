package Collections.Project3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Card> set = new HashSet<>();

        int count = 0;

        while (set.size() < 4) {

            System.out.println("Enter a card :");

            String symbol = sc.next();
            int number = sc.nextInt();

            count++;

            set.add(new Card(symbol, number));
        }

        System.out.println("Four symbols gathered in " + count + " cards.");

        TreeSet<Card> sorted = new TreeSet<>(set);

        System.out.println("Cards in Set are :");

        for (Card c : sorted) {
            System.out.println(c.getSymbol() + " " + c.getNumber());
        }

        sc.close();
    }
}
