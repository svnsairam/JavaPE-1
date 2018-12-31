import java.util.Scanner;

public class Q10_RepeatingLastNLetters {
    public static  void  main(String arg[]){
        Scanner     scanner = new Scanner(System.in);
        String      inputString = new String();
        inputString = scanner.nextLine();
        int     inputInt = scanner.nextInt();
        int     difference = inputString.length()-inputInt;

        System.out.print(inputString);
        for(int i=0;i<inputInt;i++){
            for(int j=difference;j<inputString.length();j++){
                System.out.print(inputString.charAt(j));
            }
        }
    }
}
