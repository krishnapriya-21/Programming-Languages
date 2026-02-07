import java.util.Scanner;
public class UnaryOperator {
    public static void main(String[] args){

        Scanner getInput= new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int a = getInput.nextInt();
        getInput.close();

        //indicating positive value
        int A = +a;
        System.out.println("A = +a ->" + A);

        //changes positive to negative and vice versa
        A =-a;
        System.out.println("A = -a ->" +A);

        //Prefix Increament 
        System.out.println("++a ->"+ ++a);

        //Postfix Increament
        System.out.println("a++ ->" + a++);

        //Prefix Decreament
        System.out.println("--a ->" + --a);

        //Postfix Decreament
        System.out.println("a-- ->" + a--);

        boolean flag = false;

        //Not operator flips a boolean value
        System.out.println(!flag);

    }
}
