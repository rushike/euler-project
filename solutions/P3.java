
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import number_theory.Basic;
/**
 * Euler Project Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29. 
 * What is the largest prime factor of the number 600851475143 ?
 */
public class P3{
    public static void main(String[] args) {
        long c = new P3().largest_factor(600851475143L);
        System.out.println("Largest Factor : " + c);
    }

    public long largest_factor(long number){
        int mid = (int)Math.sqrt(number);
        ArrayList<Integer> prime_list = Basic.sieve_eratosthenes(mid);
        int sz = prime_list.size(),  in = sz - 1;
        while(in > 0){
            if(number % prime_list.get(in) == 0 ) return prime_list.get(in);
            in--;
        }
        return number;
    }
}