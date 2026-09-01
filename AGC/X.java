package AGC;

public class X {

    public void fibonacci(int n) {

        int a = 1;
        int b = 1;
        int c;

        if (n == 1 || n == 2) {
            System.out.println("Fibonacci term = 1");
            return;
        }

        for (int i = 3; i <= n; i++) {

            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Fibonacci term = " + b);
    }
}