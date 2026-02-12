
import java.util.ArrayList;

public class WrapperClass {
    
    public static void main(String[] args){

        //Using wrapper classes with collections
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(5);  // Autoboxing: int 5 is converted to Integer object
        numbers.add(10); // Autoboxing: int 10 is converted to Integer object

        int sum=0;
        for(Integer num: numbers){
            sum+= num; // Unboxing: Integer object is converted to int
        }

        System.out.println("Numbers:" + numbers);
        System.out.println("Sum: " + sum);

        //Conversion
        String strnum= "123456";
        int num = Integer.parseInt(strnum); // Converting String to int
        System.out.println("Parsed number:" +num);

        double d = Double.parseDouble("67.78"); // Converting String to double
        System.out.println("Parsed double:" +d);


        int number = 123;
        String str = Integer.toString(number); // Converting int to String
        System.out.println("String representation:" + str);

        //Utility methods
        char c1 ='A';
        char c2= '5';
        System.out.println("Is c1 a digit?" + Character.isDigit(c1));
        System.out.println("Is c2 a digit?" + Character.isDigit(c2));

        String s1 = "true";
        boolean b = Boolean.parseBoolean(s1); // Converting String to boolean
        System.out.println("Parsed boolean:" +b);


    }

}
