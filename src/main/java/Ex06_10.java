import java.util.Scanner;

public class Ex06_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hap = 0;
        int num;
        System.out.printf(" 값 입력 : ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            hap += i;
        }
        System.out.printf(" 1에서 %d까지의 합 : %d \n", num, hap);
    }
}
