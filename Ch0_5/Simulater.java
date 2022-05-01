package Ch0_5;

import Ch0_5.jobs.Characters;
import Ch0_5.jobs.King;

public class Simulater {
    public static void main(String[] args) {
        Characters king = new King();
        king.attack();
        king.introduce();
    }
    
}

