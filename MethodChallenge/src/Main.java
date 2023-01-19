public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Tim", calculateHighScorePosition(1500));

        displayHighScorePosition("Rebeca", calculateHighScorePosition(999));

        displayHighScorePosition("Olivia", calculateHighScorePosition(499));

        displayHighScorePosition("Karl", calculateHighScorePosition(99));

        displayHighScorePosition("Timea", calculateHighScorePosition(-1000));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " managed to get into position " +
                playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
