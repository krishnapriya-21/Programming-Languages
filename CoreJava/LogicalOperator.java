import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int a = getInput.nextInt();
        System.out.println("Enter the value of B:");
        int b= getInput.nextInt();
        getInput.close();

        System.out.println("Performing Logical operations on A and B");
        if(a>b && a>0){
            System.out.println("a>b && a>0 condition is Executed");
            System.out.println("Both A is greater than B AND A is greater than 0");
        }
        else if(a<b || b>0){
            System.out.println("a<b || b>0 condition is Executed");
            System.out.println("Either A is lesser than B OR B is greater than 0 OR Both are True");
        }
        if (!(a==b)){
            System.out.println("!(a==b) condition is executed");
            System.out.println("A and B are NOT Equal");
        }
    }
}
