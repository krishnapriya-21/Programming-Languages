// importing scanner class 
import java.util.Scanner;
 public class Sum{
    public static void main(String[] agrs){

        // creating object of scanner class
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the value for A: ");

        // storing value of a using scanner object
        int A= getInput.nextInt();
        System.out.println("Enter the input for B:");

        //storing value of b using scanner object
        int B= getInput.nextInt();

        //closing scannre object
        getInput.close();
        
        //performing arithmetic add operation
        int sum= A + B;

        //printing the sum of two numbers
        System.out.println("The sum of two numbers is : " +sum );
    }
 }