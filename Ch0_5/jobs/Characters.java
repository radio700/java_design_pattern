package Ch0_5.jobs;

import Ch0_5.Weapons.WeaponIterface;

public abstract class Characters {

    WeaponIterface weaponIterface;

    public void attack(){
        weaponIterface.attack();
    }

    public abstract void introduce();

    public Characters(){};
    
}
