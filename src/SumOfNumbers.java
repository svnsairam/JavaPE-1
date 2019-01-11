import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number and 0 if you are finished: ");
        int input;
        int sum = 0;
        while ((input = scanner.nextInt()) != 0) {
            sum = sum + input;
        }
        System.out.print(sum);
    }
}
