
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
