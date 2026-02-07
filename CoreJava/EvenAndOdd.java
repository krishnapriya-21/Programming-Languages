import java.util.Scanner;
public class EvenAndOdd {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number= getInput.nextInt();
        getInput.close();

        if(number%2==0){
            System.out.println("The number is Even number");
        }
        else {
            System.out.println("The number is Odd");
        }

    }
}
