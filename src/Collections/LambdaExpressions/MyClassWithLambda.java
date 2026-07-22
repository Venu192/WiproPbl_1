package Collections.LambdaExpressions;

interface WordCount {

    int count(String str);
}

public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = (str) -> {

            if (str.trim().isEmpty())
                return 0;

            return str.trim().split("\\s+").length;
        };

        String s = "Welcome to Wipro TalentNext Java Program";

        System.out.println("Sentence : " + s);

        System.out.println("Word Count : " + wc.count(s));
    }
}
