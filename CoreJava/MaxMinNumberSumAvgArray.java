import java.util.Scanner;
public class MaxMinNumberSumAvgArray {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);

        //Declaration of Array

        int[] numbers = new int[5];

        //Assigning numbers array with values

        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter the value to store in array:");
            numbers[i] =getInput.nextInt();
        }

        //Printing the Array values 

        for(int i=0;i<numbers.length;i++){
            System.out.println("Array elements are:" + numbers[i]);
        }

        int max = numbers[0];
        int min= numbers[0];
        int sum =0;
       

        for(int num : numbers){
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }

            // Finding sum of numbers
            sum+=num;

        }

        // Finding Average of the numbers
        double avg = (double) sum/numbers.length;


        System.out.println("The maximum number in the array is :" + max);
        System.out.println("The min number in the array is : " + min);
        System.out.println("The sum of numbers in array is :" + sum);
        System.out.println("The average of the given numbers is : " +avg);

        getInput.close();

    }
}
