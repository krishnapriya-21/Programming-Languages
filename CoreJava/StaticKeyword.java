//Definition: Used for members (variables, methods, blocks, nested classes) that belong to the class rather than any specific object.

//Key Points:

//Shared across all objects of the class.

//Can be accessed without creating an object.

//Useful for constants, utility methods, and memory efficiency.

public class StaticKeyword {
    
    //static variable
    static int count =0;

    //static method

    static void greet(){
        System.out.println("Hello from static method");
    }

    public static void main(String[] args){
       

        //Accessing static function without object
        StaticKeyword.greet();

         //Accessing static variable directly
        System.out.println("Accessing static variable directly:" + StaticKeyword.count);
        
    }

}
