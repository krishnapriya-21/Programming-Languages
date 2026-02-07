// printing the cube of a number
import java.util.Scanner;
public class MethodReturnJumpStatement {
    
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number to find its cube:");
        int number = getInput.nextInt();
        getInput.close();

        System.out.println("The cube of number " + number +"is : " + findSquare(number));

    }

    public static int findSquare( int num){
        return num*num*num;
    }

  
}
