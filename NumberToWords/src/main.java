public class main {

    public static void main(String[] args) {

        numberToWords(0);
        numberToWords(123);
        numberToWords(-1);
        numberToWords(5200);
        numberToWords(0);

    }

    public static void numberToWords(int number) {

        if (number < 0) {

            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {

            System.out.println("Zero");
            return;
        }

        int digits = getDigitCount(number);
        int reverseNumber = reverse(number);
        StringBuilder numberInString = new StringBuilder();
        int loopCounter = 0;

        while (reverseNumber != 0) {
            loopCounter++;
            int lastDigit = reverseNumber % 10;
            numberInString.append(switch (lastDigit) {
                case 0 -> "Zero ";
                case 1 -> "One ";
                case 2 -> "Two ";
                case 3 -> "Three ";
                case 4 -> "Four ";
                case 5 -> "Five ";
                case 6 -> "Six ";
                case 7 -> "Seven ";
                case 8 -> "Eight ";
                case 9 -> "Nine ";
                default -> "INVALID";
            });
            reverseNumber = reverseNumber / 10;
        }

        if (loopCounter != digits) {

            numberInString.append("Zero ".repeat(Math.max(0, digits - loopCounter)));
        }

        System.out.println(numberInString);
    }

    public static int getDigitCount(int number) {

        if (number < 0) {

            return -1;
        } else if (number == 0) {

            return 1;
        }

        int counter = 0;

        while (number != 0) {
            counter++;
            number = number / 10;
        }

        return counter;
    }

    public static int reverse(int number) {

        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

        return reverse;
    }
}
