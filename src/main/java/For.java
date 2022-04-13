public class For {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            for(int j=1; j<10; j++) {
                if(i==0){
                    System.out.printf("##제 %d 단##\t\t",j);
                }else {
                    System.out.print(j + " * " + i + " = " + (i * j) + "\t\t");
                }
            }
            System.out.println();
        }
    }
}
