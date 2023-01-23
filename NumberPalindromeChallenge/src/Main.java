public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-123));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(-1));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int numberDummy = number;

        while (numberDummy != 0) {
            reverse = (reverse * 10) + (numberDummy % 10);
            numberDummy = numberDummy / 10;
        }

        return number == reverse;
    }
}
