
import java.util.Arrays;

import extended_number.*;
import number_theory.Basic;


public class P11{
    public static void main(String[] args) {
       extended_number.Z num = new extended_number.Z();
       System.out.println("Factorial trailing zeroes :  " + Z.factorial_trailing_zeros(100, 10));
    //    System.out.println("largest :  " + Basic.largest_factor(10));
       System.out.println("factorial len : " + Z.factorial_length(100, 10));
       System.out.println("factorial : " + num.factorial(100000));
       System.out.println("fact : " + num.factorial_op(100));
       System.out.println("factorial : " + Arrays.toString(num.scale(new int[]{0, 1 << 31}, 1, 0))); 
       System.out.println("factorial : " + Arrays.toString(num.scale_in_between(new int[]{0, 1 << 31}, 2, 0, 155, 0))); 
    }
}