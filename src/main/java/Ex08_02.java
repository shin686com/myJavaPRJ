import java.util.Scanner;

public class Ex08_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] aa = new int[4];
        int hap;

//        System.out.printf("1번째 숫자를 입력하세요 : ");
//        aa[0] = in.nextInt();
//        System.out.printf("2번째 숫자를 입력하세요 : ");
//        aa[1] = in.nextInt();
//        System.out.printf("3번째 숫자를 입력하세요 : ");
//        aa[2] = in.nextInt();
//        System.out.printf("4번째 숫자를 입력하세요 : ");
//        aa[3] = in.nextInt();
        for(int i=0; i<aa.length; i++){
            System.out.printf("%d번째 숫자를 입력하세요 : ",i+1);
            aa[i]= in.nextInt();;
        }

        hap=aa[0]+aa[1]+aa[2]+aa[3];

        System.out.printf(" 합계 ==> %d \n", hap);

        for(int i=0; i<4; i++){
            System.out.println("aa["+i+"]"+"="+aa[i]);
        }
    }
}
