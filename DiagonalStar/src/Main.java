public class Main {

    public static void main(String[] args) {

        printSquareStar(100);
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number;column++){
                if (column == number) {
                    System.out.println("*");
                } else if (row == 1 || column == 1 || row == number) {
                    System.out.print("*");
                } else if ( row == column) {
                    System.out.print("*");
                }else if (column == (number - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
