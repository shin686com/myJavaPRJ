import java.util.Scanner;

public class Ex07_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;

        while(true){
            System.out.printf("더할 첫 번쨰 수 입력: ");
            a=in.nextInt();
            System.out.printf("더할 두 번쨰 수 입력: ");
            b=in.nextInt();

            System.out.printf("%d + %d = %d \n",a,b,a+b);

        }
    }
}
