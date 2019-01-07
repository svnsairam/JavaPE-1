import java.util.Scanner;

public class NumberPattern {
    public static void main(String arg[]){
        Scanner     scanner = new Scanner(System.in);
        int     input = scanner.nextInt();
        for (int i=1;i<=input;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
        }
    }

}

