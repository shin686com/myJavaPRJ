import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
        //내가 입력한 숫자가 3의 배수인지? 5의 배수인지? 3과5의 배수인지?
        Scanner in = new Scanner(System.in);

        System.out.printf("숫자를 입력하세요 : ");
        int a = in.nextInt();

        if ((a % 3 == 0) && (a % 5 == 0)) {
            System.out.printf("3과5의 배수입니다.");
        } else if (a % 3 == 0) {
            System.out.printf("3의 배수입니다.");
        } else if (a % 5 == 0) {
            System.out.printf("5의 배수입니다.");
        }
    }
}
