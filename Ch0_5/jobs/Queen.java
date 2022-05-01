package Ch0_5.jobs;

import Ch0_5.Weapons.Bow;

public class Queen extends Characters{

    public Queen(){
        weaponIterface = new Bow();
    }

    @Override
    public void introduce() {
        System.out.println("난 퀸임");
        
    }
    
}
