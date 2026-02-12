
public class StringClass {

    public static void main(String[] args){

        // creating a string in string literal

        String str = "Java Programming";

        //Basic methods

        System.out.println("Length od string:" + str.length());
        System.out.println("Character at index 5:" + str.charAt(5));
        System.out.println("Substring from index 5 to 11:" + str.substring(5,11));
        System.out.println("String in uppercase:" + str.toUpperCase());
        System.out.println("String trimmed:" + str.trim());
        System.out.println("String replaced:" + str.replace("Java", "Python"));

        //Searching in string
        System.out.println("Index of 'Programming':" + str.indexOf("Programming"));
        System.out.println("Does string contain java? " + str.contains("Java"));


        //splitting string
        String[] words = str.trim().split(" ");
        System.out.println(" Words in the string:");
        for(String word: words){
            System.out.println(word);
        }

        //comparison of strings
        String str2 = new String("Java Programming");

        System.out.println("== comparison:" + (str == str2));
        System.out.println("equals () comparison:" + str.equals(str2));


        //String Builder 

        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World !");
        System.out.println(sb);


    }
    
}
