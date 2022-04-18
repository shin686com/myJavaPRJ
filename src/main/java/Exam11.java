import java.util.Scanner;

public class Exam11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n ; i++) {
            for(int j = 1; j < i; j++)
                System.out.print(" ");
            for(int j = 0; j <= (n-i)*2; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i = 1; i < n ; i++) {
            for(int j = 1; j < n-i; j++)
                System.out.print(" ");
            for(int j = 0; j <= i*2; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
