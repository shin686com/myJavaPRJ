import java.util.Scanner;

public class Test02 {
    public static void main(String[] argc){
        Scanner in = new Scanner(System.in);
        System.out.printf("첫번째 계산할 값을 입력하세요 ==>");
        int n1= in.nextInt();
        System.out.printf("<1>덧셈<2>뺄셈<3>곱셈<4>나눗셈 ==>");
        int select=in.nextInt();
        System.out.printf("두번째 계산할 값을 입력하세요 ==>");
        int n2= in.nextInt();
        if(select==1){
            System.out.printf("%d + %d = %d",n1,n2,n1 + n2);
        }else if(select==2){
            System.out.printf("%d - %d = %d",n1,n2,n1 - n2);
        }else if(select==3){
            System.out.printf("%d * %d = %d",n1,n2,n1 * n2);
        }else if(select==4){
            System.out.printf("%d / %d = %d",n1,n2,n1 / n2);
        }else{
            System.out.printf("잘못입력하셨습니다.");
        }

    }
}
