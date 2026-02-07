
public class Arrays {
    public static void main(String[] args){

        // Method No : 1
        
        // Plain Declaration of array 
        int[] numbers;

        // Allocation of Array
         numbers =  new int[5];

         //Initialization of array

         numbers[0]= 10;
         numbers[1]=20;
         numbers[2]=30;
         numbers[3]=40;
         numbers[4]=50;

         
         // Printing the Array elements using for iteration

         for(int i=0;i<numbers.length;i++){
            System.out.println("Printing numbers using Iteration: " + numbers[i]);
         }


         //Method No : 2

         //Declaration and Initialization of array\

         int[] marks = {70,80,90,95,100};

         //Printing the Array elements using enhanced FOR loop

         for(int mark: marks){
            System.out.println( "Printing marks using Enhanced for loop : " +mark);
         }


         //Multi-Dimensional Array

         //Printing a 3x3 matrix 

         int[][] matrix = {
            {10,20,30,40,50},
            {60,70,80,90,100},
            {110,120,130,140,150}
         };

         for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println("");

         }


    }
}
