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
        this("white","auto",4);//Car(String color, String gearType, int door)를 호출하는 것
    }
}


public class CarTest2 {
    public static void main(String[] args) {
        Car car = new Car();//[3]
        System.out.println(car.color);
    }
}
