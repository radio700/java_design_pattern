package JAVA_JUNG_SEOK.CH07.CH07_15;

class Car{
    String color;
    int door;

    void drive(){
        System.out.println("drive!!!!!!!!");
    }

    void stop(){
        System.out.println("STOP!!!!!!!!!");
    }
}

class FireEngine extends Car{
    void water(){
        System.out.println("WATER!!!!!!");
    }
}


public class CastingTest1 {
    public static void main(String[] args) {

        //Castring1==========================================

        // Car 조상 = null;

        // FireEngine 자손 = new FireEngine();
        // FireEngine 자손2 = null;

        // 자손.water();

        // 조상 = 자손;
        // //조상.water();//안됨 자손이 조상꺼 안됨 ((왜냐면 자손에는 새로 생긴 변수+메쏘드가 있기에 메모리 초과!!))

        // 자손2 = (FireEngine)조상;//조상은 자손 참조변수로 형 변환이 가능하다((왜냐면 자손은 메모리가 더 늘어났기에!! 변수땜에))
        // 자손2.water();

        //Castring2==========================================
        //★조상타입은 자손에 관여 할 수 없다
        Car car = new Car();
        Car car2 = new Car();
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine)car;//여기서 에러 왜냐면 조상 타입 인스턴스가 자손 타입 참조변수로 참조하는건 불가하기에
        
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
