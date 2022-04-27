public class Test06 {
    public static void main(String[] args) {
        for (int i = 2; i < 7; i++) {
            for (int j = 3; j < 9; j++) {
                System.out.printf("%d X %d = %d\t", j, i, j * i);
            }
            System.out.println("");
        }
        int hap = 0;
        for (int i = 50; i < 101; i++) {
            if (i % 3 == 0 || i % 7 == 0 || i % 11 == 0) {
            } else {
                hap += i;
            }
        }
        System.out.printf("%d", hap);
    }
}
