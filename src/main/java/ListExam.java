import java.util.LinkedList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        int listSize = list.size();

        for(int i=0; i<listSize; i++){
            System.out.println("이름 : "+list.get(i));
        }
    }
}
