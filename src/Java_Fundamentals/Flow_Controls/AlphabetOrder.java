package Java_Fundamentals.Flow_Controls;

import java.util.Scanner;

public class AlphabetOrder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("1st element: ");
        char a=sc.next().charAt(0);
        System.out.print("2nd element: ");
        char b=sc.next().charAt(0);
        if(a<b){
            System.out.print(a +","+b);
        }
        else{
            System.out.print(b +","+a);
        }
    }
}
