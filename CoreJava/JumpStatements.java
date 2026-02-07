import java.util.Scanner;
public class JumpStatements{

    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number between 1 - 10 to stop printing at:");
        int num1 = getInput.nextInt();

        for(int i= 1; i<=10;i++){
            if(i==num1){
                System.out.println("The Loop is stopped at: " +i);
                //Breaks the for Loop
                break;
            }
            else{
                System.out.println(i);
            }
        }

        System.out.println("Enter a number between 1 - 10 to skip at: ");
        int num2 = getInput.nextInt();

        for(int i = 1; i<=10; i++){
            if(i==num2){
                System.out.println("Skipping the loop at number: " + i);
                continue;
            }
            else{
                System.out.println(i);
            }
        }

        getInput.close();

    }
}