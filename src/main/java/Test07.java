import java.util.*;


public class Test07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        List<String> arr = new ArrayList<>();

        in.nextLine();

        for (int i = 0; i < N; i++) {
            arr.add(in.nextLine());
        }

        arr.sort(new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length();
                }
            }
        });


        System.out.println(arr.get(0));

        for (int i = 1; i < arr.size(); i++) {
            if (!arr.get(i).equals(arr.get(i-1))) {
                System.out.println(arr.get(i));
            }
        }
    }

}