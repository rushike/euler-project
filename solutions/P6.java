

/**
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640. 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class P6{
    public static void main(String[] args) {
        System.out.println("Diff (a + b + ...)^2 - a^2 + b^2 ...   : " + diff(100));
    }

    public static long diff(int max){
        return natural_series_sum(max) * natural_series_sum(max) - natural_series_squares_sum(max);
    }

    public static long natural_series_sum(int max) {
        return (max * (max + 1)) / 2;
    }

    public static long natural_series_squares_sum(int max) {
        return (max * (max + 1) * (2 * max + 1))/ 6;
    }

}