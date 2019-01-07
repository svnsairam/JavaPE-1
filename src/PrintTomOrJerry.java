import java.util.Scanner;

public class PrintTomOrJerry {
    public static void main(String ar[]) {
        System.out.println("Enter digit between 20 to 30");
        Scanner     scanner = new Scanner(System.in);
        byte    input = scanner.nextByte();
        if((input%2==0) && (input >= 20)
                        && (input<=30)){
            System.out.print("Tom");
        } else {
            System.out.print("Jerry");
        }
    }
}
