

import java.util.Scanner;


public class EncapsulationPwd {
    
    public static void main(String[] args){

        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String passwordIP = getInput.nextLine();

        // Creating a new instance of the class 
        Password myPassword = new Password();

        // using setter method, setting the password to input password
        myPassword.setName(passwordIP);

        System.out.println("Do you want to see your password? (y/n)");

        char answer= getInput.next().charAt(0);

        if(answer=='y'){

        //Using getter method to print the password
        System.out.println("Your password is : "+myPassword.getName());
       }

       getInput.close();

    }
}

class Password{

    //Hidding the data with private access modifier
    private String password;

    // Setting the private data to an input
    public void setName(String pwd){
        this.password = pwd; //controlled access using this keyword
    }

    //Getting the private data using get function
    public String getName(){
        return password;
    }

}
