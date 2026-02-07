import java.util.Scanner;
public class IFElseLadderControlStatement {
    public static void main(String[] args){
        
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter your mark:");
        int mark = getInput.nextInt();
        getInput.close();

        if(mark>95){
            System.out.println("Grade is A");
        }
        else if(mark>85){
            System.out.println("Grade is B");
        }
        else if(mark>75){
            System.out.println("Grade is C");
        }
        else if(mark>45){
            System.out.println("Grade is D");
        }
        else {
            System.out.println("Fail");
        }

    }
}
