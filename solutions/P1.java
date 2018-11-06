import java.util.Arrays;

public class P1{
    public static void main(String[] args) {
        long c = (new P1()).sum_multiple(1000, 3, 5);
        System.out.println(c);
    }

    public long sum_multiple(long max, int ... m){
        int sum = 0, j;
        Arrays.sort(m);
        //System.out.println("Multiples  : " + Arrays.toString(m));
        long iter = m[0];
        while(iter < max){
            j = 0;
            while(j < m.length){
                if(iter % m[j] == 0) {
                    sum += iter;
                    break;
                }j++;
            }iter++;
        }
        return sum;
    }
}