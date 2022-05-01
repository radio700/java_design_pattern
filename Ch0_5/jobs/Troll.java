package Ch0_5.jobs;

import Ch0_5.Weapons.Axe;

public class Troll extends Characters{

    public Troll(){
        weaponIterface = new Axe();
    }

    @Override
    public void introduce() {
        System.out.println("난 트롤임");
        
    }
    
}
