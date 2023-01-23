public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(100));
        System.out.println(sumDigits(-100));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(1232));
        System.out.println(sumDigits(3));
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

        int sumofDigits = 0;

        while (number > 9) {
            sumofDigits += number % 10;;
            number = number / 10;
        }

        sumofDigits += number;

        return sumofDigits;
    }
}
