package JAVA_JUNG_SEOK.CH07.CH07_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product(){
        price = 0;
        bonusPoint = 0;
    }
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

//=================================================
class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    ArrayList<Product> item = new ArrayList<>();

    void buy(Product p){
        if(money <p.price){
            System.out.println("돈이 부족해서 못사여");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;

        item.add(p);
        System.out.println(p+"를 구입하셔씁니다");
    }
    
    void refund(Product p){
        if(item.remove(p)){
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p+"를 반품하셔씃ㅂ니다");
        }else{
            System.out.println("구입 한 제품 중에 제품이 없ㅅ브니다");
        }
    }

    void Summary(){
        int sum = 0;
        String itemlist = "";

        if(item.isEmpty()){
            System.out.println("구입한게 없어요");
            return;
        }
        for(int i = 0; i < item.size(); i++){
            Product p = (Product)item.get(i);
            sum += p.price;
            itemlist += (i==0) ? ""+p : ", "+p;
        }
        System.out.println("구입하신 물품 금액은 "+sum+" 입니다");
        System.out.println("구입 하신 제품은 "+itemlist+ " 입니다");


    }
}

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        Tv tv = new Tv();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(tv);//헐!!
        b.Summary();
    }
}
