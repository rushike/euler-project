import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import number_theory.Basic;

public class P10{
    public static void main(String[] args) { 
        ArrayList<Integer> list= Basic.sieve_eratosthenes(2000000);
        System.out.println("Arra : " + list.size());
        System.out.println("sum of prime below : " + sum_series(list));
    }
    public static long sum_series(ArrayList<Integer> series) {
        return Basic.sum_series(series);
    }
}