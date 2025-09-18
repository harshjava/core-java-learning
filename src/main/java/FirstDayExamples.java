package main.java;

public class FirstDayExamples {

    public static void main(String[] args) {

        // Additon of two numbers
        int a = 24;
        int b = 25;

        int result = a+b;

        System.out.println("Sum of two numbers " + result);

        // Java Variable Example: Widening

        int d=10;
        float f=d;
        System.out.println(d);
        System.out.println(f);

        //Java Variable Example: Narrowing (Typecasting)

        float fl=10.5f;
        //int g=fl;//Compile time error
        int g=(int)fl;
        System.out.println(fl);
        System.out.println(g);

        // Java Variable Example: Overflow

        //Overflow
        int h=130;
        byte i=(byte)h;
        System.out.println(h);
        System.out.println(i);
    }
}
