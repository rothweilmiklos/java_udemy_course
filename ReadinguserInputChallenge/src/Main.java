import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        sumUserInput();
    }

    public static void sumUserInput() {

        int numberOfInputs = 1;
        double sumOfNumbers = 0;

        while (numberOfInputs <= 5) {
            System.out.println("Enter number #" + numberOfInputs + ": ");

            try {
                sumOfNumbers += validateUserInput(getUserInput());
                numberOfInputs++;
            } catch (NumberFormatException wrongInputType) {
                System.out.println("Wrong character type, please type numeric value!");
            }

        }

        System.out.println("The sum of the entered numbers is " + sumOfNumbers);
    }


    public static String getUserInput() {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        return userInput;
    }

    public static double validateUserInput(String userInput) {

            double userInputInteger = Double.parseDouble(userInput);

            return userInputInteger;
        }
}


