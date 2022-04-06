import java.util.Scanner;

public class Ex06_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hap = 0;
        int num1, num2, num3;

        System.out.printf(" 시작값 입력 : ");
        num1 = in.nextInt();
        System.out.printf(" 끝값 입력 : ");
        num2 = in.nextInt();
        System.out.printf(" 증가값 입력 : ");
        num3 = in.nextInt();
        if (num1 < num2) {
            for (int i = num1; i <= num2; i += num3) {
                hap += i;
            }
            System.out.printf(" %d에서 %d까지 %d씩 증가한 값의 합 : %d \n", num1, num2, num3, hap);
        } else {
            System.out.printf("시작값이 끝값보다 큽니다.");
        }
    }
}
