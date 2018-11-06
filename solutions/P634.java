import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P634{

    public static void main(String[] args) {
        int in = (new Scanner(System.in)).nextInt();
        System.out.println("fn_count : " + fn_count(in));
    }
    /**
     * Of form a^2 * b^3 , a,b E Natural Numbers
     * Define F(n) to be the number of integers x≤n 
     * that can be written in the form x=a^2 * b^3, where a and b are integers not necessarily different and both greater than 1.
     */
    public static int fn_count(long x) {
        int fifth_root = (int)Math.pow(x, 0.2);
        Set se1 = new HashSet<String>();
        Set se2 = new HashSet<String>();
        /**
         * Cal in 2 steps
         */
        int count = 0, a = 2, b = (int)Math.pow(x/4, 0.333333) + 1, intr = b + 1, cd = (int)Math.pow(x/8, 0.5) + 1;
        // System.out.println("\n\na : " + a + ", b : " + b);
        while(a < cd && b != 1){
            // System.out.println("a : " + a + ", b : " + b);
            while(b > 1) {
                //System.out.println("fn( " + b + " ) = " + fn(a, b));
                if(fn(a, b) <= x) {
                    se1.add("(" + a + "^2, " + b + "^3)");
                    // System.out.println("("+a+", "+b+" ) ==> " +fn(a, b));
                    count++;
                }
                b--;
            }
            b =  (int)Math.pow(x/(a * a), 0.333333) + 1;
            a++;
        }
        
        // System.out.println("Count : " + count);
        return se1.size();
    }

    public static int fn(int a, int b) {
        return (int)(Math.pow(a, 2) * Math.pow(b, 3));
    }
}