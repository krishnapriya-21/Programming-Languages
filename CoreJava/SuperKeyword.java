//2. The super Keyword
//Definition: Refers to the parent (superclass) of the current object.

//Key Uses:

//Access parent class variables/methods when they are hidden by child class.

//Call parent class constructor from child class constructor.


class Animal{
    String name = "Animal";
    
    Animal(){
        System.out.println("Animal Constructor called");
    }

    void sound(){
        System.out.println("Animal makes a sound");
    }

}

class Dog extends Animal{
   
    String name = "Dog";

    static int count =0;

    //Calling Animal constructor

    Dog(){
        super();  // calls the constructor of the parent class (Animal)
        count++; // Incrementing the count og dog instances
    }

    void sound(){
        super.sound();  // calls the method sound() of the parent class
        System.out.println("Dog barks");
    }

    void displayNames(){
        System.out.println(" Parent class name: " + super.name);
        System.out.println("Child class name:" + this.name);
    }

    static void displayCount(){
        System.out.println("Number of dog instances :" + count);
    }
}


public class SuperKeyword {
    
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sound();
        dog.displayNames();


        //Purpose of count (static variable):  
        //In the example, count is a static variable that tracks how many Dog objects have been created.
        //Every time you call new Dog(), the constructor increments count.
        Dog dog2 = new Dog();
        Dog.displayCount();
    }
}
