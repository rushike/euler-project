import number_theory.Basic;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class P4{
    public static void main(String[] args) {
        System.out.println("Reverse : " + Basic.reverse(10222323112L));
        System.out.println("Base : " + Basic.to_base(10222323112L, 10));
        System.out.println("Palinn " + largest_palindrome());
    }

    public static int largest_palindrome() {
        StringBuilder sb;
        int start = 999;
        while(start > 9){
            sb = new StringBuilder();
            
            sb.append(Basic.to_base(start, 10));
            sb.append(Basic.reverse(start));

            int num = (int)Integer.parseInt(sb.toString());
            int largest_fact = (int)Basic.largest_factor(num);
            System.out.println("num : " + num + "  largest_fact : "+ largest_fact);
            if(largest_fact > 99 && largest_fact < 1000){
                int se = num / largest_fact;
                System.out.println("se : "+ se);
                if(se > 99 && se < 1000) return num;
            }
            start--;
        }
        return 0;
    }


}