import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class CapitalSmallDigitSpecialLetter {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        char      charInput;
        System.out.println("Enter a charecter");
        charInput = scanner.nextLine().charAt(0);

        if((charInput-'0') >=0 && (charInput-'0') <= 9){
            System.out.println("Number");
        }else if((charInput-'a') >=0 && (charInput-'z') <= 25){
            System.out.println("Small Letter");
        }else if((charInput-'A') >=0 && (charInput-'Z') <=25){
            System.out.println("Capital Letter");
        }else {
            System.out.println("Special Charecter");
        }

    }

}
