import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        //내가 입력한 숫자가 홀인지 짝인지 출력해보는 프로그램
        //10 -> 짝입니다 11-> 홀입니다
        Scanner in = new Scanner(System.in);

        System.out.printf("숫자를 입력하세요 : ");
        int a = in.nextInt();

        if (a % 2 == 0) {
            System.out.printf("짝입니다.");
        } else {
            System.out.printf("홀입니다.");
        }
    }
}
