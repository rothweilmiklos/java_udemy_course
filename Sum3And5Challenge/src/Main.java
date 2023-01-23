public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int adequateNumberCounter = 0;

        for (int i = 1; i <= 1000 && adequateNumberCounter <= 5; i++) {
             if ((i % 3 == 0) && (i % 5 == 0)) {
                 System.out.println(i + " has met the conditions.");
                 sum += i;
                 adequateNumberCounter += 1;
             }
        }

        System.out.println(sum + " is the sum of the adequate numbers.");
    }
}
