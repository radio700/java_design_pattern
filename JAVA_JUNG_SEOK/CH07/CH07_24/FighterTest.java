package JAVA_JUNG_SEOK.CH07.CH07_24;

class unit{
    int HP;
    int x;
    int y;
}

interface Moveable{
    void move(int x, int y);
}

interface Attackable{
    void attack(unit u);
}

interface Fightable extends Attackable, Moveable{
//오호 implement 두개를 모와서 하나로 쓸 수 있네???????????
}

class Fighter extends unit implements Fightable{

    @Override
    public void attack(unit u) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void move(int x, int y) {
        // TODO Auto-generated method stub
        
    }
}


public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        
        if(f instanceof unit){
            System.out.println("f는 unit클래스 자손임");
        }
        if(f instanceof Fightable){
            System.out.println("f는 Fightable클래스 자손임");
        }
        if(f instanceof Moveable){
            System.out.println("f는 Moveable클래스 자손임");
        }
        if(f instanceof Attackable){
            System.out.println("f는 Attackable클래스 자손임");
        }
        if(f instanceof Object){
            System.out.println("f는 Object클래스 자손임");
        }
    }
}
