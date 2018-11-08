import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class P9{
    public static void main(String[] args) {
       System.out.println("d's : "+ list_diff(10)); 
       System.out.println("1000 ---- >> " + pythagorean_to_1000());
    }

    public static int pythagorean_to_1000() {
        // 1000 = a + 2 * a^2 / d^2
        int in= 0,step = 1, a;
        long start = System.currentTimeMillis();
        ArrayList<Integer> dlist = list_diff(10);
        while(step < 128){
            step = dlist.get(in);
            a = step;
            while(true){
                System.out.println("a : " + a + " step : " + step);
                if(is_int(sum(a, step)) && a < 440){
                    if((int)sum(a, step) == 1000) {
                        System.out.println("x----> : a : " + a + "   .>>> : step "+ step);
                        System.out.println("sum : " + sum(a, step));
                        System.out.println("iis_int : " + is_int(sum(a, step)));
                        return calc(a, step);
                    }
                    a = step + a;
                }else if(a < 440){
                    a = step + a;
                }else{
                    in++;
                    break;
                }
                if(System.currentTimeMillis() - start == 2000){
                    try{
                        Thread.sleep(1000);
                        }catch(Exception e){
                            e.printStackTrace(); 
                        }
                        start = System.currentTimeMillis();
                }
            }
            
        }
        return 0;
    }

    public static int calc(int a, int step) {
        int b = (a * a - step * step) / (2 * step);
        int c = step + b;
        return a * b  * c;

    }

    public static ArrayList<Integer> list_diff(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < n; i++){
            if(i % 2 == 1) list.add(i*i);
            list.add(2 * i * i);
        }
        Collections.sort(list);
        return list;
    }

    public static double sum(int a, int d){
        return a + 1.0 * a * a / d;
    }

    public static boolean is_int(double num) {
        double diff = num - (int)num;
        if(diff == 0) return true;
        return false;
    }
}