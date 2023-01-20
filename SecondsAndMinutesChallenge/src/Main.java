public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(3560, 45));
        System.out.println(getDurationString(3000, 65));
        System.out.println(getDurationString(-3000, 65));
        System.out.println(getDurationString(800));
        System.out.println(getDurationString(-800));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid seconds value";
        }

        int minutes = seconds / 60;
        int secondsRemainder = seconds % 60;

        String convertedHours = getDurationString(minutes, secondsRemainder);

        return convertedHours;
    }

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || !(seconds >= 0 && seconds <=59)) {
            return "Invalid value(s)";
        }

        int hoursResult = minutes / 60;

        int minutesRemainder = minutes % 60;

        String resultString = hoursResult + "h " + minutesRemainder + "m " + seconds + "s";

        return resultString;
    }
}
