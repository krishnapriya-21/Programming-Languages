

class Animal1{
    String name = "Animal";
    
    Animal1(){
        System.out.println("Animal Constructor called");
    }

    void sound1(){
        System.out.println("Animal makes a sound");
    }

}

class Dog1 extends Animal1{
   
    String name = "Dog";

    static int count =0;

    //Calling Animal constructor

    Dog1(){
        super();  // calls the constructor of the parent class (Animal)
        count++; // Incrementing the count og dog instances
    }

    void sound1(){
        super.sound1();  // calls the method sound() of the parent class
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
        Dog1 dog = new Dog1();
        dog.sound1();
        dog.displayNames();


        //Purpose of count (static variable):  
        //In the example, count is a static variable that tracks how many Dog objects have been created.
        //Every time you call new Dog(), the constructor increments count.
        Dog1 dog2 = new Dog1();
        Dog1.displayCount();
    }
}
