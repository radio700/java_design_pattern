package JAVA_JUNG_SEOK.CH07.CH07_21;

class Product{
    int price;
    int bonusPoint;

    public Product(int price) {//생성자 받으라고 써 있네
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv extends Product{//조상에 선언만 해놨으니까 자손에서는 초기화를 시켜야겠찌??????????????? 그래서 constructer가 나오는거

    Tv(){
        super(100);
    }

    public String toString(){
        return "Tv";
    }
}

class Computer extends Product{

    Computer(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}

//============================
class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액부족");
            return;
        }
        money -=p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p+"를 구입했습니다");
    }
}



public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("남은 돈은 "+b.money);
    }
}
