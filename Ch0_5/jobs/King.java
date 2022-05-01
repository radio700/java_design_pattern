package Ch0_5.jobs;

import Ch0_5.Weapons.Knife;

public class King extends Characters{

    public King(){
        weaponIterface = new Knife();
    }

    @Override
    public void introduce() {
        System.out.println("난 킹임");
        
    }
    
}
