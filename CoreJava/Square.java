import java.util.Scanner;
public class Square {
    public static void main(String[] args){
        Scanner getInput= new Scanner(System.in);
        System.out.println("Enter the number to find square:");
        int number = getInput.nextInt();
        getInput.close();
        int square= number*number;
        System.out.println("The square of the number"  +" "+number + " "+ "is" +" "+ square);
            
    }
}
