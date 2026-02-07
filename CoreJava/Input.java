// importing scanner class from java utility class
import java.util.Scanner;
public class Input {
    public static void main(String args[]){
        
        // creating an instance of the class scanner
        Scanner getinput = new Scanner(System.in);

        System.out.println("Enter a number :");

        //getting input using method of scanner object
        int a= getinput.nextInt();

        //consume the new line as input leftover by nextInt
        getinput.nextLine();

        System.out.println("Enter your name:");

        //Getting a string as input
        String name= getinput.nextLine();

        //closing the scanner object
        getinput.close();

        System.out.println("Hello,"+name +" " +"The number you entered is :" + a);
        
    }
}
