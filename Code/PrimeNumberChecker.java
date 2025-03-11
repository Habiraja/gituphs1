public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number = 8; // You can change this number to test other values
        boolean isPrime = isPrime(number);
        System.out.println("Is " + number + " a prime number? " + isPrime);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
