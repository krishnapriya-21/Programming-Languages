
public class MODynamicPolymorphism {
    public static void main(String[] args){

        // Plain object of class vehicle with refernce type vehicle and obeject of vehicle
        Vehicle myvehicle = new Vehicle();


        //Runtime polymorphism
        //The reference type is vehicle and actual object of particular vehicles
        Vehicle mycar = new Car1();
        Vehicle myscooter = new Scooter1();
        Vehicle myelectriccar = new ElectricCar1();
        
        myvehicle.start();
        mycar.start();
        myscooter.start();
        myelectriccar.start();
        
    }    
}

// Base class which other classes extends
class Vehicle{
    void start(){
        System.out.println("vehicle is starting...");
    }
}

// Class that extends base class
class Car1 extends Vehicle{
    @Override
    void start(){
        System.out.println("Car starts with key ignition");
    }
}

class Scooter1 extends Vehicle{
    @Override
    void start(){
        System.out.println("Scooter starts with button");
    }
}

class ElectricCar1 extends Vehicle{
    @Override
    void start(){
        System.out.println("Electric car starts silently with a button");
    }
}




