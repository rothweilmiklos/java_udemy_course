public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(-1));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {

            return -1;
        }

        int lastDigit = number % 10;

        while (number > 9) {
            number = number / 10;
        }

        return number + lastDigit;
    }
}
