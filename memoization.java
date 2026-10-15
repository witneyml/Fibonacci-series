import java.util.Arrays;

public class memoization {

    public static  long fibonacci(int n, long[] memoization) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if (n <= 1) {
            return n;
        }

    if (memoization[n] != 1) {
        return memoization[n];
    }

    memoization[n] = fibonacci(n-1, memoization) + fibonacci(n-2, memoization);

    return memoization[n];
    }

        public static void main(String[] args) {
        int n = 10;
        long[] memoization = new long[n+1];

        Arrays.fill(memoization, 1); 
        for (int i = 0; i <= n;i++) {
            System.out.print(fibonacci(i, memoization) + (i == n ? "" : ", "));
        }
    }
}
