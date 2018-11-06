
public class P2{
    public static void main(String[] args) {
        long c = new P2().even_fibonacci_sum(4000000);
        System.out.println("even_fibonacci_sum : " + c);
    }

    public long even_fibonacci_sum(int max){
        int a = 1, b = 2, temp;
        long sum = 0;
        while(b <= max){
            if((b & 1) == 0){
                sum += b;
            }
            temp = a;
            a = b;
            b = a + temp;
        }
        return sum;
    }
}