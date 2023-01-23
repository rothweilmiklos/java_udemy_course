public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal <= 0) {

            return false;
        }

        for (int i = bigCount; i >= 0; i--) {
            if (i * 5 <= goal) {
                bigCount = i;
                break;
            }
        }

        for (int i = smallCount; i >= 0; i--) {
            if (bigCount * 5 + i == goal) {
                smallCount = i;
                break;
                }
            }

        return bigCount * 5 + smallCount == goal;
    }
}