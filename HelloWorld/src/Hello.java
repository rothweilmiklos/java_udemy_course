public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Mike");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 79;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println(("Either or both of the conditions are true"));
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isChar = false;
        if (!isChar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true; //if the condition is true before the ? mark than the operand after the ? mark is returned, else the other operand after the :
        isDomestic = (makeOfCar != "Volkswagen"); //this does the same as the line above

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double firstNumber = 20.00d;
        double secondNumber = 80.00d;
        double multiplySum = (firstNumber + secondNumber) * 100.00d;
        double remainderNumber = multiplySum % 40.00d;

        boolean isZero = (remainderNumber == 0) ? true : false;

        System.out.println(isZero);

        if (!isZero) {
            System.out.println("got some remainder");
        }

    }
}
