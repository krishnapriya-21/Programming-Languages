
import java.util.Scanner;
import java.util.Arrays;
public class ArrayOperations {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);

        // Declaration and allocation of array
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers to add in array:");

        for(int i=0; i<numbers.length; i++){
            numbers[i] = getInput.nextInt();
        }

        //Printing the arrays as string

        System.out.println("The Entered numbers are:" + Arrays.toString(numbers));

        // Sorting array elements
        
        Arrays.sort(numbers);

        System.out.println("Numbers after sorting are:" + Arrays.toString(numbers));

        // Finding number in array

        System.out.println("Enter the number to search in array:");
        int searchElement = getInput.nextInt();

        int index = Arrays.binarySearch(numbers,searchElement);

        if(index>=0){
            System.out.println("The search element " + searchElement +" is found in index :" + index);
        }
        else{
            System.out.println("The Search element " + searchElement + " is not Found in Array");
        }

        //Copying arrays to another array

        int[] copy = Arrays.copyOf(numbers,numbers.length);
        System.out.println("Successfully copied the array elements " + Arrays.toString(copy));

        getInput.close();
    }
}
