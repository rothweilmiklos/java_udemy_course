public class AreaClaculator {

    public static void main(String[] args) {

        System.out.println("Are of the circle is " + area(5));
        System.out.println("Are of the circle is " + area(-1));

        System.out.println("Are of the rectangle is " + area(5, 4));
        System.out.println("Are of the rectangle is " + area(-1, 4));
    }

    public static double area(double radius) {

        if (radius < 0) {

            return -1;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {

        if (y < 0 || x < 0) {

            return -1;
        }

        return x * y;
    }
}

