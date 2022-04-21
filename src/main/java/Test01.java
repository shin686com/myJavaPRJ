import java.util.Scanner;

public class Test01 {
    public static void main(String[] argc)
    {
        Scanner in = new Scanner(System.in);
        int n1= in.nextInt();
        int n2= in.nextInt();
        int n3= in.nextInt();
        int n4= in.nextInt();

        System.out.printf("%d + %d + %d + %d = %d",n1,n2,n3,n4,n1+n2+n3+n4);
    }
}
