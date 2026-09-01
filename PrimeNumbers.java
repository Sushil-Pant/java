class PrimeNumbers {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int count = 0;

        System.out.println("Prime numbers between " + m + " and " + n );

        for (int num = m; num <= n; num++) {

            if (num < 2)
                continue;

            boolean prime = true;

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Count = " + count);
    }
}
