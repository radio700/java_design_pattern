package JAVA_JUNG_SEOK.CH07.CH07_26;

class Unit{
    double MAX_HP;
    double HP;

    double MAX_MANA;
    double mana;

    double MAX_SHIELD;
    double shield;

    Unit (int MAX_HP){
        this.MAX_HP = MAX_HP;
    }

    Unit (int MAX_HP, int MAX_MANA){
        this.MAX_HP = MAX_HP;
        this.MAX_MANA = MAX_MANA;
    }

    Unit (int MAX_HP, int MAX_MANA, int shield){
        this.MAX_HP = MAX_HP;
        this.MAX_MANA = MAX_MANA;
        this.MAX_SHIELD = shield;
    }
}

class GroundUnit extends Unit{

    GroundUnit(int MAX_HP) {
        super(MAX_HP);
    }
}

class AirUnit extends Unit {

    AirUnit(int MAX_HP) {
        super(MAX_HP);
    }
}

interface Machinery{}

class SiegeTank extends GroundUnit implements Machinery{

    SiegeTank() {
        super(150);
        HP = MAX_HP;
    }
    public String toString(){
        return "SIEGE TANK";
    }
}

class Dropship extends AirUnit implements Machinery{

    Dropship() {
        super(150);
        HP = MAX_HP;
    }
    public String toString(){
        return "DROP SHIP";
    }
}

class Marine extends GroundUnit{

    Marine() {
        super(40);
        HP = MAX_HP;
    }
    public String toString(){
        return "MARINE";
    }
}

class SCV extends GroundUnit implements Machinery{

    SCV() {
        super(40);
        HP = MAX_HP;
    }

    void Repair(Machinery Machine){
        Unit u = (Unit) Machine;
        if(Machine instanceof Unit){//머시너리가 유닛의 인스턴스라면
            while(u.HP!=u.MAX_HP){
                u.HP++;
            }
            System.out.println(u.toString()+"의 수리가 끝났습니다");
        }else{
            System.out.println(u.toString()+"기계 유닛이 아닙니다");
        }
    }
    public String toString(){
        return "SCV";
    }
}

public class RepairableTest {
    public static void main(String[] args) {
        SiegeTank siegetank = new SiegeTank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.Repair(siegetank);
        scv.Repair(dropship);
        scv.Repair(scv);
        //scv.Repair(marine);
        
    }
}
