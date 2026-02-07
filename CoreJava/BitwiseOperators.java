public class BitwiseOperators {
    public static void main (String[] args){
        //Binary value : 0101
        int a = 5;

        //Binary value: 0011
        int b= 3;

        //Bitwise AND 
        System.out.println("a & b ->" + (a&b));

        //Bitwise OR
        System.out.println("a | b ->" +(a|b));

        //Bitwise XOR
        System.out.println("a^b ->" +(a^b));

        //Bitwise compliment
        System.out.println("~a ->" + (~a));

        //Signed left shift
        System.out.println("a<<1 left shift by 1 ->" + (a<<1));

        //signed right shift
        System.out.println("a>>1 right shift by 1 ->" + (a>>1));

        //Unsigned right shift
        System.out.println("a>>>1 unsigned right shift by 1 ->" +(a>>>1));

    }
}
