import java.util.Scanner;

public class MethodOverLoadingStaticPolymorphism{

    public static void main(String[] args){

        Calculator calc = new Calculator();

        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter Value of A and B :");
        int a= getInput.nextInt();
        int b= getInput.nextInt();

        System.out.println(calc.add(a,b));

        System.out.println("Enter the value of C and D in double: ");

        double c = getInput.nextDouble();
        double d = getInput.nextDouble();

        System.out.println( calc.add(c,d));

        System.out.println("Enter the values od E,F, G in integer type: ");

        int e = getInput.nextInt();
        int f = getInput.nextInt();
        int g = getInput.nextInt();

        System.out.println(calc.add(e,f,g));

        getInput.close();

    }

}

class Calculator{

    // Method of return type int with add method name
    int add(int a, int b){
        return a + b;
    }

    //Method of return type double with same method name
    double add(double a, double b){
        return a+b;
    }

    //Method of return type int with 3 arguments with same method name
    int add(int a, int b, int c){
        return a+b+c;
    }

}