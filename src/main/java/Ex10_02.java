public class Ex10_02 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try{
            aa[2]=100/0;
            aa[3]=100;
        }catch (Exception e){
            System.out.println("에러 메시지 : "+e);
        } finally {
            System.out.println("이 부분은 무조건 나와요 ~~");
        }
    }
}
