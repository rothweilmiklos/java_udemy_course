public class Main {

    public static void main(String[] args) {

        int incrementedNumber = 5;
        int evenNumberCounter = 0;
        int oddNumberCounter = 0;
        
        while (incrementedNumber <= 20) {
            if (evenNumberCounter == 5) {
                break;
            }
            if (isEvenNumber(incrementedNumber)) {
                System.out.println(incrementedNumber);
                evenNumberCounter++;
            } else {
                oddNumberCounter++;
            }
            incrementedNumber++;
        }

        System.out.println("There was " + oddNumberCounter + " odd number and " + evenNumberCounter + " even number");
    }

    public static boolean isEvenNumber(int number) {

        return number % 2 == 0;
    }
}
