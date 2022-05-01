package Ch03;

public class HouseCoffee extends Beverage{

    public HouseCoffee(){
        description = "하우스 커피";
    }

    @Override
    public double cost() {
        return .89;
    }
    
}
