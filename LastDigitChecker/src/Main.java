public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));

    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {

        if (!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {

            return false;
        }

        int lastDigitFirstNumber = firstNumber % 10;
        int lastDigitSecondNumber = secondNumber % 10;
        int lastDigitThirdNumber = thirdNumber % 10;

        return lastDigitThirdNumber == lastDigitFirstNumber ||lastDigitFirstNumber == lastDigitSecondNumber ||
                lastDigitThirdNumber == lastDigitSecondNumber;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <=1000;
    }
}
