package Ch0;

import Ch0.fly.FlyWithWings;
import Ch0.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }    

    public void display() {
        System.out.println("난 물오리야");
        
    }
    
}
