public class Main {

    public static void main(String[] args) {

        System.out.println(isPrimeNumber(2));
        System.out.println(isPrimeNumber(3));
        System.out.println(isPrimeNumber(4));
        System.out.println(isPrimeNumber(5));
        System.out.println(isPrimeNumber(20));
        System.out.println(isPrimeNumber(29));

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {

        if (number <= 1) {

            return -1;
        }

        for (int i = number / 2; i > 2; i--) {
            if(number % i == 0 && isPrimeNumber(i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrimeNumber(int number) {

        for (int i = 2; i <= number / 2; i++){
            if (number % i == 0) {

                return false;
            }
        }

        return true;
    }
}
