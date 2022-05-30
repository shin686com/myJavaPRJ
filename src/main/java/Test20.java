import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;


public class Test20 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] origin = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();


        for(int i = 0; i < N; i++) {
            sorted[i] = origin[i] = in.nextInt();
        }

        Arrays.sort(sorted);

        int rank = 0;
        for(int k : sorted) {
            if(!rankingMap.containsKey(k)) {
                rankingMap.put(k, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int key : origin) {
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);
    }
}