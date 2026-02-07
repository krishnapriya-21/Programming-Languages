
// The class that is been inherited
class  Animal{
    public void eat(){
        System.out.println("Animal Eats");
    }
}

//The class that inherited another class

class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }
}


public class Inheritance {
    public static void main(String[] args){

        //creating an object of the class Dog that inherited another class

        Dog dogObj = new Dog();

        // Calling the inherited method 
        dogObj.eat();

        //Calling the own method of class dog
        dogObj.bark();

    }
}
