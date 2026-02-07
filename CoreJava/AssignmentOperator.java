import java.util.Scanner;
public class AssignmentOperator{

    public static void main(String[] args){
        Scanner getInput= new Scanner(System.in);
        System.out.println("Enter the value for A:");
        
        // Basic assigning value to valriable a
        int a = getInput.nextInt();

        getInput.close();

        // Add and assign operator
        a+= 10;
        System.out.println("a+=10 ->"+ a);

        //subtract and assign operator
        a-=5;
        System.out.println("a-=5 ->"+ a);

        //multiply and assign operator
        a*=2;
        System.out.println("a*=2 ->"+ a);

        //Divide and assign operator
        a/=2;
        System.out.println("a/=2 ->"+ a);

        //Modulus and assign operator
        a%=5;
        System.out.println("a%=5 ->" + a);



    }
}