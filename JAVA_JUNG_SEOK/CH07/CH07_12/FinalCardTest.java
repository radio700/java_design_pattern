package JAVA_JUNG_SEOK.CH07.CH07_12;

class Card{
    final int NUMBER;//final이지만 선언만 하면서 생성자 에서 초기화 해 줄 수 있음
    final String KIND;

    static int width = 100;
    static int height = 200;

    Card(String kind, int num){//그리되면 인스턴스마다 final이 붙은 변수가 다른 값을 갖도록 할 수 있음
        KIND = kind;
        NUMBER = num;
    }

    Card(){
        this("heart", 1);
    }

    public String toString(){
        return KIND + " " + NUMBER;
    }
}


class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card("heart", 1);
        //c.NUMBER = 5; final이라서 안됨

        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
