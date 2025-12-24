package wguJavaFundamentals;

public class q1LetterPatternOutput {
    public static void main(String[] args) {

        //Output character "H" using just print
        System.out.println("H   H");
        System.out.println("H   H");
        System.out.println("HHHHH");
        System.out.println("H   H");
        System.out.println("H   H");

        System.out.println();

        //Output character "H" using for loops
        for (int i = 0; i < 2; i++) {
            System.out.println("H   H");
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("HHHHH");
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("H   H");
        }

    }
}
