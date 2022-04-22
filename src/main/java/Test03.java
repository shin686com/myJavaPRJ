import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m,k,sum=0;
        n=in.nextInt();
        m=in.nextInt();
        int[][] arr= new int[n+1][m+1];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                arr[i][j]=in.nextInt();
            }
        }

        k= in.nextInt();
        for(int a=0; a<k; a++) {
            sum = 0;
            int i2 = in.nextInt();
            int j2 = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            for (int i = i2; i <= x; i++) {
                for (int j = j2; j <= y; j++) {
                    sum += arr[i][j];
                }
            }
            System.out.printf("%d\n", sum);
        }
    }
}
