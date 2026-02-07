
import java.util.Scanner;

// createing a class named car
class Car{

    // variable carname
    String carname;
    //variable speed
    int speed;
    
    //method printing car name and its speed 
    void drive(){
        System.out.println("Your car " + carname + " is driving in the speed " + speed + " km/h" );
    }
}

public class ClassesAndObjects {
    public static void main(String[] args){
        
        Scanner getInput = new Scanner(System.in);
        
        //creating an instance of the class car

        Car myCar = new Car();

        System.out.println("Enter your car name : ");
        String mycarname = getInput.nextLine();

        //Assigning the input to the car class variable
        myCar.carname = mycarname;

        System.out.println("Enter the speed you are driving in: ");
        int mycarspeed = getInput.nextInt();

        //Assigning the input
        myCar.speed = mycarspeed;

        //Calling the method drive of car class to print output

        myCar.drive();

        getInput.close();


    }
}
