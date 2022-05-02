public class Test09 {
    class Test {//함수
        long sum(int[] a) {
            long sum = 0;

            for(int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            return sum;
        }
    }

}
