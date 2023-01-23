import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        double sum = 0;
        long avg = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int enteredNumber = Integer.parseInt(scanner.nextLine());
                counter++;
                sum += enteredNumber;
                avg = Math.round((double) (sum / counter));
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        System.out.println("SUM = " + (long) (sum) + " AVG = " + avg);
    }
}
