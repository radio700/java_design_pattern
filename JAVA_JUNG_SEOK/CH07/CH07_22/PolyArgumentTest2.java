package JAVA_JUNG_SEOK.CH07.CH07_22;

class Product{
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
    Product(){}
}

class Tv extends Product{

    public Tv() {
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}

class Computer extends Product{

    public Computer() {
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}

class Audio extends Product{

    public Audio() {
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}

//================================

class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    Product[] item = new Product[10];
    int i = 0;

    void buy(Product p){

        if(money < p.price){
            System.out.println("돈이 부족해여");
            return;
        }
        
        money -= p.price;
        bonusPoint += p.bonusPoint;

        item[i++] = p;
        System.out.println(p+"를 구입했습니다");
    }

    void Summary(){
        int sum = 0;
        String itemlist ="";

        for(int i = 0; i < item.length; i++){
            if(item[i] ==null) break;
            sum += item[i].price;
            itemlist += (i==0) ? ""+item[i] :", "+item[i];
        }
        System.out.println("구입 총 금액 : "+sum+" 입니다");
        System.out.println("구입 제품은 "+itemlist+" 입니다");


    }
}

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Audio());
        b.Summary();
    }
}
