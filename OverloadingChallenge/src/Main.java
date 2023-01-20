public class Main {

    public static void main(String[] args) {

        System.out.println(convertHeightInchesToCentimeters(5, 10));
    }

    public static double convertHeightInchesToCentimeters(int heightInInches) {

        return heightInInches * 2.54d;
    }

    public static double convertHeightInchesToCentimeters(int heightInFeet, int heightInInches) {

        heightInInches = heightInInches + (heightInFeet * 12);

        double result = convertHeightInchesToCentimeters(heightInInches);

        return result;
    }
}
