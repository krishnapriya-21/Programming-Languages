
// Base class which other classes extends
class Vehicle{
    void start(){
        System.out.println("vehicle is starting...");
    }
}

// Class that extends base class
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car starts with key ignition");
    }
}

class Scooter extends Vehicle{
    @Override
    void start(){
        System.out.println("Scooter starts with button");
    }
}

class ElectricCar extends Vehicle{
    @Override
    void start(){
        System.out.println("Electric car starts silently with a button");
    }
}



public class MethodOverridingDynamicPolymorphism {
    public static void main(String[] args){

        // Plain object of class vehicle with refernce type vehicle and obeject of vehicle
        Vehicle myvehicle = new Vehicle();


        //Runtime polymorphism
        //The reference type is vehicle and actual object of particular vehicles
        Vehicle mycar = new Car();
        Vehicle myscooter = new Scooter();
        Vehicle myelectriccar = new ElectricCar();
        
        myvehicle.start();
        mycar.start();
        myscooter.start();
        myelectriccar.start();
        
    }    
}
