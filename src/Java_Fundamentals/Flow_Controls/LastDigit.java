package Java_Fundamentals.Flow_Controls;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

        //partB
        System.out.print("first num: ");
        int a=sc.nextInt();
        System.out.print("Second num: ");
        int b=sc.nextInt();

        if(a%10==b%10){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
