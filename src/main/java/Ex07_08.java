import java.util.Scanner;

public class Ex07_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        while(true){
            System.out.printf("더할 첫 번째 수 입력: ");
            a=in.nextInt();
            if(a==0){
                break;
            }
            System.out.printf("더할 두 번째 수 입력: ");
            b=in.nextInt();
            System.out.printf("%d + %d = %d \n", a, b, a+b);
        }
    }
}
