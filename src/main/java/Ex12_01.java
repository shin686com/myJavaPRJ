class Car2 {
    String color;
    int speed;

    void upSpeed(int value){
        speed += value;
    }

    void downspeed(int value){
        speed -= value;
    }
}

class sedan extends Car2{
    int setNum;

    public int getSetNum(){
        return setNum;
    }
}

class  truck extends Car2{
    int capacity;

    public int getCapacity(){
        return capacity;
    }
}

public class Ex12_01{
    public static void main(String[] args) {
        sedan sedan1 = new sedan();
        truck truck1 = new truck();

        sedan1.upSpeed(300);
        truck1.upSpeed(100);

        sedan1.setNum=5;
        truck1.capacity =50;

        System.out.println("승용차의 속도는 "+ sedan1.speed+"km, 좌석수는"+
                sedan1.getSetNum()+"입니다.");
        System.out.println("트럭의 속도는"+truck1.speed+"km, 적재량은 "+
                truck1.getCapacity());
    }
}
