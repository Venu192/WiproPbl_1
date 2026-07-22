package Java_Fundamentals.language_basics;

public class Sum {
    public static void main(String[] args){
        if(args.length==2){
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int sum = a+b;
            System.out.println("The sum of "+a+" and "+b+" is: "+sum);
        }
        else{
            System.out.println("no");
        }
    }
}
