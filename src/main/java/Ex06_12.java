import java.util.Scanner;

public class Ex06_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf(" 몇 단 ? ");
        int dan = in.nextInt();

        for(int i=9; i>0; i--){
            System.out.printf(" %d X %d = %d \n", dan, i, dan*i);
        }
    }
}
