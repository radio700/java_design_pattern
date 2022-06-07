package JAVA_JUNG_SEOK.CH06.CH06_24;

public class Car {
    
    String color;
    String gearType;
    int door;

    Car(){};

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class CarTest{
    public static void main(String[] args) {
        Car c1 = new Car("white", "auto", 4);
        Car c2 = new Car();
        
    }
}
