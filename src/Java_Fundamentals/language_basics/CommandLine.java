package Java_Fundamentals.language_basics;

public class CommandLine {
    public static void main(String[] args){
        if(args.length==1){
            System.out.println("Welcome " +args[0]);
        }
        else{
            System.out.println("no");
        }
    }
}
