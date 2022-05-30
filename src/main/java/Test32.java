import java.util.*;

public class Test32 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        int m = in.nextInt();
        if((n>=3 && n<=100) && (m>=10 && m<=300000)){
            BlackJack(n,m);
        }
    }

    public static void BlackJack(int n , int m){
        int[] arr = new int[n];
        ArrayList list = new ArrayList();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = i-1; j >= 0; j--) {
                for (int k = j-1 ; k >= 0; k--) {
                    sum=arr[i]+arr[j]+arr[k];
                    if(m>=sum){
                        list.add(sum);
                    }
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }
}
