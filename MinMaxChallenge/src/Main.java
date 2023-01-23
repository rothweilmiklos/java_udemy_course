import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        getMinMax();
    }

    public static void getMinMax() {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int loopCount = 0;
        String inputData = "";
        int inputDataInteger = 0;

        while (true) {
            System.out.println("Enter a number to continue or any character to quite!");
            inputData = scanner.nextLine();
             try {
                 inputDataInteger = Integer.parseInt(inputData);
             } catch (NumberFormatException nfe) {
                 break;
             }
             if (inputDataInteger > max || loopCount == 0) {
                 max = inputDataInteger;
             }
             if (inputDataInteger < min || loopCount == 0) {
                 min = inputDataInteger;
             }
             loopCount++;
         }
        System.out.println("By typing a non numeric value You have exited the loop.");

        if (loopCount > 0) {
            System.out.println("The maximum value you have entered is " +
                    max +
                    " and the minimum value you have entered is " +
                    min);
        }
    }
}
