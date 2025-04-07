public class PracticeProblem {

    public static void main(String[] args) {
        System.out.println("sumOfDigits(234): " + sumOfDigits(234));    
        System.out.println("sumOfDigits(12): " + sumOfDigits(12));      
        System.out.println("sumOfDigits(-12): " + sumOfDigits(-12));    
        System.out.println("sumOfDigits(39): " + sumOfDigits(39));      

        System.out.println("factorial(5): " + factorial(5));           
        System.out.println("factorial(0): " + factorial(0));           
        System.out.println("factorial(-3): " + factorial(-3));         
    }

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
