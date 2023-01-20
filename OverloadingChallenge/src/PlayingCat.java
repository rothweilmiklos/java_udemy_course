public class PlayingCat {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        int temperatureLowerBound = 25;
        int temperatureUpperBound = summer ? 45 : 35;

        return ((temperature >= temperatureLowerBound) && (temperature <= temperatureUpperBound));
    }
}
