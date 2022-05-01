package Ch0_5.jobs;

import Ch0_5.Weapons.Sword;

public class Knight extends Characters{

    public Knight(){
        weaponIterface = new Sword();
    }

    @Override
    public void introduce() {
        System.out.println("난 나이트임");
        
    }
    
}
