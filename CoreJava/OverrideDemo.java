public class OverrideDemo{
    public static void main(String[] args){
        
        // Object of parent class with refernce of parent class
        Parent parent = new Parent();

        // Object of child class with parent reference
        Parent child = new Child();

        parent.greet();
        child.greet();

    }
}

//Base class 
class Parent{
    void greet(){
        System.out.println("Hello From Parent class");
    }
}

//Child class
class Child extends Parent{
    
    @Override
    void greet(){
        System.out.println("hello from child class");
    }   
}

