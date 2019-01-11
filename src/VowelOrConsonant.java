import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int asciiValues[] = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            asciiValues[i] = (int) input.charAt(i);
        }
        boolean isProperWord = checkForWord(asciiValues);

        if (isProperWord) {
            for (int i = 0; i < asciiValues.length; i++) {
                switch (asciiValues[i]) {
                    case 65:
                        System.out.print("Vowel ");
                        break;
                    case 69:
                        System.out.print("Vowel ");
                        break;
                    case 73:
                        System.out.print("Vowel ");
                        break;
                    case 79:
                        System.out.print("Vowel ");
                        break;
                    case 85:
                        System.out.print("Vowel ");
                        break;
                    case 97:
                        System.out.print("Vowel ");
                        break;
                    case 101:
                        System.out.print("Vowel ");
                        break;
                    case 105:
                        System.out.println("Vowel ");
                        break;
                    case 111:
                        System.out.print("Vowel ");
                        break;
                    case 117:
                        System.out.print("Vowel ");
                        break;
                    default:
                        System.out.print("Consonant ");
                }
            }

        } else {
            System.out.print("Error Not a proper word");
        }

    }

    public static boolean checkForWord(int[] asciiValues) {
        for (int i = 0; i < asciiValues.length; i++) {
            if (((asciiValues[i] < 65) || (asciiValues[i] > 122) ||
                    ((asciiValues[i] >= 91) && (asciiValues[i] <= 96)))) {
                return false;
            }
        }
        return true;
    }

}
