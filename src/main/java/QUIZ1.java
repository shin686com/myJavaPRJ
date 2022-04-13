import java.util.Scanner;

public class QUIZ1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a%2==0){
            System.out.printf("%d 는 짝수입니다.",a);
        }else{
            System.out.printf("%d 는 홀수입니다.",a);
        }

    }
}
