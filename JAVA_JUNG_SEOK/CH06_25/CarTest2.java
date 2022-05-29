package JAVA_JUNG_SEOK.CH06_25;

class Car{
    String color;
    String gearType;
    int door;

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    
    // Car(String color){
    //     this(color,"auto",4);
    // }

    Car(){
        this("white","auto",4);//main문에 써도 되는 것 디폴트 생성자[3] 를 세팅해 주는 것
    }
}


public class CarTest2 {
    public static void main(String[] args) {
        Car car = new Car();//[3]
        System.out.println(car.color);
    }
}
