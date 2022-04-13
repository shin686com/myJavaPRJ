public class QUIZ2 {
    public static void main(String[] args){
        int result=0;
        for(int i=1; i<101; i++){
            if(i%3==0 || i%5==0){
                result+=i;
            }
        }
        System.out.printf("%d",result);
    }
}
