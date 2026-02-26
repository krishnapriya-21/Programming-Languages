// printing the cube of a number
import java.util.Scanner;
public class MethodReturnJumpStatement {
    
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number to find its cube:");
        int number = getInput.nextInt();
        getInput.close();

        System.out.println("The cube of number " + number +"is : " + findCube(number));

    }

    public static int findCube( int num){
        return num*num*num;
    }

  
}
