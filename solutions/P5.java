import number_theory.Basic;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class P5{
    public static void main(String[] args) {
        System.out.println("Smallest Positive Integer : " + Basic.smallest_positive_multiple(Basic.arithmetic_array(1, 1, 20)));
    }

    
}