import java.util.ArrayList;
import java.util.Iterator;

public class Test16 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        int listSize = list.size();

        for(int i=-0; i<listSize; i++){
            System.out.println("이름 : "+list.get(i));
        }
        for(String name : list){
            System.out.println("이름 : "+name);
        }
        list.forEach(name -> System.out.println("이름 : "+name));

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String name = it.next();
            System.out.println("이름 : "+name);
        }
    }
}
