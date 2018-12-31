import java.util.Scanner;

public class Q9_ReverseString {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        String      inputString = new String();
        System.out.println("Enter a string to reverse");
        inputString = scanner.nextLine();
        for(int i=0;i<inputString.length();i++){
            System.out.print(inputString.charAt(inputString.length()-i-1));
        }

    }
}
