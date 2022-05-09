import java.util.Arrays;
import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>2 && n<51) {
            int[] card = new int[n];
            for(int i = 0; i < n-1; i++){
                card[i] = in.nextInt();
            }
            Arrays.sort(card,0, n-1);
            for(int i = 0; i < n; i++){
                if(card[i] != i+1){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}