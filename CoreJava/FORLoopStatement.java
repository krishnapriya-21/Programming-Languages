import java.util.Scanner;
public class FORLoopStatement {
    public static void main (String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the multiplication table number:");
        int number = getInput.nextInt();
        getInput.close();

        for(int i=1;i<=10;i++){
            System.out.println(number +"*" + i +"=" + number*i );
        }

    }
}
