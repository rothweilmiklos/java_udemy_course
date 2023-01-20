public class Main {

    public static void main(String[] args) {

        char natoLetter = 'F';

        switch (natoLetter) {
            case 'A':
                System.out.println(natoLetter + " Able");
                break;
            case 'B':
                System.out.println(natoLetter + " Baker");
                break;
            case 'C':
                System.out.println(natoLetter + " Charlie");
                break;
            case 'D':
                System.out.println(natoLetter + " Dog");
                break;
            case 'E':
                System.out.println(natoLetter + " Easy");
                break;
            default:
                System.out.println(natoLetter + " wrong letter");
                break;
        }
    }
}
