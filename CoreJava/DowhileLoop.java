// password validation 

import java.util.Scanner;
public class DowhileLoop {
    public static void main(String[] args){
        Scanner getInput= new Scanner(System.in);

        String password = "java123";
        String ipPassword;

        do{
                System.out.println("Enter the password");
                ipPassword= getInput.nextLine();

                if(!ipPassword.equals(password)){
                    System.out.println("Password Incorrect, Try again!");
                }
        }
        while (!ipPassword.equals(password));

        System.out.println("Access Granted");
        getInput.close();

    }
}
