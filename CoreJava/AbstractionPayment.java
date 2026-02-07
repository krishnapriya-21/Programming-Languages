

import java.util.Scanner;

// creating abstract class for abstract methods

abstract class Payment{

    //Abstract method - without body
    abstract void makePayment(double amount);

    //concreate method - with body
    void paymentComplete(){
        System.out.println("Payment Completed !");
    }
}

//class extending abstracting class to access its abstract methods

class CreditCard extends Payment{
    void makePayment(double amount){
        System.out.println("Paid " + amount + " Using credit card");
    }
}

class Upi extends Payment{
    void makePayment(double amount){
        System.out.println("Paid " + amount + " Using UPI payment");
    }
} 

public class AbstractionPayment {
    
    public static void main(String[] args){

        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter payment method : (Credit/UPI) ");
        String payment = getInput.nextLine();

        System.out.println("Enter the amount : ");
        double amount = getInput.nextDouble();

        // Declaring the variable with refernce to abstract class
        Payment p;


        if(payment.equalsIgnoreCase("credit")){

            // Assigning the variable to be an instance of child class credit card
            p = new CreditCard();

            // calling the abstract method using object
            p.makePayment(amount);

            // calling concreate method
            p.paymentComplete(); 
        }
        else if(payment.equalsIgnoreCase("UPI")){
            //Assigning the variable to an instance of child class UPI 
            p = new Upi();

            //calling the abstract method using object
            p.makePayment(amount);

            // calling concreate method
            p.paymentComplete();
        }

        getInput.close();

    }
}
