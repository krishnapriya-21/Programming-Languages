import java.util.Scanner;
public class TernaryOperator{
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = getInput.nextInt();

        System.out.println("Enter the second number:");
        int num2 = getInput.nextInt();

        int result = num1>num2?num1:num2;
        System.out.println("The largest number is:" + result);
    }
}