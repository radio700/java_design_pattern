package JAVA_JUNG_SEOK.CH06.CH06_5;

public class Card {
    
    String kind;//인스턴스 변수
    int number;
    
    static int width = 100;//클래스 변수
    static int height = 250;


    public static void main(String[] args) {
        System.out.println("card.width = "+Card.width);// 헐 시발? 인스턴스 생성을 안해도 접근이 가능하네???
        System.out.println("card.width = "+Card.height);// 헐 시발? 인스턴스 생성을 안해도 접근이 가능하네???

        Card c1 = new Card();
        c1.kind = "heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + " 이며 크기는 (" + c1.width + ", " + c1.height+")");
        System.out.println("c1은 " + c2.kind + ", " + c2.number + " 이며 크기는 (" + c2.width + ", " + c2.height+")");

        System.out.println("width 와 height 값을 변경합니다");

        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + " 이며 크기는 (" + c1.width + ", " + c1.height+")");
        System.out.println("c1은 " + c2.kind + ", " + c2.number + " 이며 크기는 (" + c2.width + ", " + c2.height+")");

        


    }        
}


