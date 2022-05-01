package Ch0;

import Ch0.fly.FlyNoWay;
import Ch0.quack.Quack;

public class ModelDuck extends Duck{
    
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("오리모형이에야");
    }
    
}
