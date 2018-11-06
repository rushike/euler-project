package number_theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import extended_number.W;
import extended_number.Z;

/**
 *
 * @author rushi
 */
public class Basic {
   
    public static boolean is_prime(long num){
        int mid_sq = (int)Math.sqrt(num), iter = 2;
        while(iter < mid_sq){
            if(num % iter == 0) return false;
            iter++;
        }
        return true;
    }


    public static ArrayList<Integer> sieve_eratosthenes(int limit){
        boolean[] not_primes = new boolean[limit + 1];
        ArrayList<Integer> prime_list;
        int current_prime = 2;
        not_primes[0] = true; not_primes[1] = true; 
        int mid_sq = (int)Math.sqrt(limit) + 1, iter = 0;
        while(current_prime < mid_sq){
            iter = current_prime;
            while(iter <= limit){
                iter += current_prime;
                if(iter <= limit) not_primes[iter] = true;
            }
            current_prime++;
            while(not_primes[current_prime] == false) break;
        }
        prime_list = new ArrayList<>();
        for(int i = 0; i < not_primes.length; i++){
            if(!not_primes[i]) prime_list.add(i);
        }
        return prime_list;
    }
    

    /**
     * a &gt b
     * gcd(a, q)
     * Using Euclid Algorithm
     * a = q * m0 + r0
     * q = r0 * m1 + r1;
     * if r_i = 0 terminate return q = r_(i-1)
     * @param a first number
     * @param q second number
     * @return q
     */
    public static long gcd(long a, long q){
        if(a % q == 0){
            return q;
        }return gcd(q, a % q);
    }
    
    public static W gcd(W a, W b) {
        W rem = a.remainder(b);
        if(rem.equals(Z.ZERO))
            return b;
        return gcd(b, rem);
    }
    /**
     * Gives lcm(Longest Common Multiplier) lcm(a,q)
     * Using formula lcm(a, q) = (a * q) / gcd(a, q)
     * Here a > q
     * @param a first number 
     * @param q second number
     * @return lcm
     */
    public static long lcm(long a, long q){
        swap(a, q);
        return (a * q) / gcd(a, q);
    }
    public static void  swap(long a, long q){
        if(a < q ){
            a = a + q;
            a = a - q;
            q = a - q;
        }
    }
    
}
