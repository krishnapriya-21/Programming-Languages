import java.util.Scanner;
public class RelationalOperator {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int a= getInput.nextInt();
        System.out.println("Enter the value for B:");
        int b= getInput.nextInt();
        getInput.close();

        boolean equals = (a==b);
        boolean greaterThan = (a>b);
        boolean lesserThan= (a<b);
        boolean greaterThanEquals = (a>=b);
        boolean lesserThanEquals = (a<=b);
        boolean notEquals = (a!=b);

        System.out.println("A equals to B is:" +equals);
        System.out.println("A greater than B is:" +greaterThan);
        System.out.println("A lesser than B is :" +lesserThan);
        System.out.println("A is greater than or equals to B is: " +greaterThanEquals);
        System.out.println("A is lesser than or equals to B is:" +lesserThanEquals);
        System.out.println("A is not equal to B is:" + notEquals);
    }
}
