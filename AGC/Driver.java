package AGC;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter string: ");
        String str = sc.next();

        X x = new X();
        Y y = new Y();
        Z z = new Z();

        x.fibonacci(n);
        y.palindrome(str);
        z.show();

        sc.close();
    }
}