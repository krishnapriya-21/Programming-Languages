//2. The super Keyword
//Definition: Refers to the parent (superclass) of the current object.

//Key Uses:

//Access parent class variables/methods when they are hidden by child class.

//Call parent class constructor from child class constructor.


class Animal{
    String name = "Animal";
    
    void sound(){
        System.out.println("Animal makes a sound");
    }

}

class Dog extends Animal{
   
    String name = "Dog";

    //Calling Animal constructor

    Dog(){
        super();  // calls the constructor of the parent class (Animal)
    }

    void sound(){
        super.sound();  // calls the method sound() of the parent class
        System.out.println("Dog barks");
    }

    void displayNames(){
        System.out.println(" Parent class name: " + super.name);
        System.out.println("Child class name:" + this.name);
    }
}


public class SuperKeyword {
    
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sound();
        dog.displayNames();
    }
}
