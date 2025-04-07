public class PracticeProblem {

    public static int sumOfDigits(int x) {
        if (x < 0) {
            x = -x;
        }
        if (x < 10) {
            return x;
        }
        return (x % 10) + sumOfDigits(x / 10);
    }

    public static int factorial(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
