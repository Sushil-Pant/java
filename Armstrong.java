class Armstrong {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        int original = n;
        int temp = n;
        int digits = 0;
        int sum = 0;

        // Count digits
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        // Calculate Armstrong sum
        temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, digits);
            temp = temp / 10;
        }

        // Check
        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");
    }
}