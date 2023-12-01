import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        The Fibonacci numbers are the numbers in the following integer sequence (Fn):

        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...

        such as

        F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.

        Given a number, say prod (for product), we search two
        Fibonacci numbers F(n) and F(n+1) verifying

        F(n) * F(n+1) = prod.

        Your function productFib takes an integer
        (prod) and returns an array:

        [F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)
        depending on the language if F(n) * F(n+1) = prod.

        If you don't find two consecutive F(n) verifying F(n) * F(n+1) = prod ; you will return

        [F(n), F(n+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)
        F(n) being the smallest one such as F(n) * F(n+1) > prod.
         */

        System.out.println(Arrays.toString(productFib(100000)));

    }
    public static long[] productFib(long prod) {
        if (prod == 0) {
            return new long[]{0, 1, 1};
        }

        long fib1 = 0;
        long fib2 = 1;

        while (fib1 * fib2 < prod) {
            long temp = fib2;
            fib2 += fib1;
            fib1 = temp;
        }

        return new long[]{fib1, fib2, fib1 * fib2 == prod ? 1 : 0};
    }
}