import java.util.Scanner;
public class Arithmetic{
    public static void main(String[] args){

        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the value for A:");
        int a= getInput.nextInt();
        System.out.println("Enter the value for B:");
        int b= getInput.nextInt();

        getInput.close();

        int add = a+b;
        int subtract= a-b;
        int product = a*b;
        int modulus = a%b;
        int division = a/b;

        System.out.println("The addition of two numbers " +a + " and " +b +" is" +" " +add);
        System.out.println("The subtraction of two numbers " +a +" and " +b +" is" +" "+subtract);
        System.out.println("The product of two numbers " +a+" and "+b+" is"+" "+product);
        System.out.println("The modulus of two numbers " + a +" and " + b + " is" +" " + modulus);
        System.out.println("The division of two numbers " +a +" and " + b+ " is" +" "+division);


    }
}