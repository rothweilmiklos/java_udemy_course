public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-1);
    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {

            System.out.println("Invalid Value");
        } else {

            int yearInDays = 365;
            int dayInHours = 24;
            int hourInMinutes = 60;
            int yearInMinutes = yearInDays * dayInHours * hourInMinutes;
            int dayInMinutes = dayInHours * hourInMinutes;

            int years = (int) minutes / yearInMinutes;
            int days = (int) minutes % yearInMinutes / dayInMinutes;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
