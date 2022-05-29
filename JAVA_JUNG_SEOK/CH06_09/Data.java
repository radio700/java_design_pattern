package JAVA_JUNG_SEOK.CH06_09;

public class Data {
    
    int x;

    public static void main(String[] args) {
        Data d = new Data();

        d.x = 10;
        System.out.println("d.x : " +d.x);

        change(d.x);
        System.out.println("after>>>>>>>");
        System.out.println("d.x : " +d.x);

    }
    static void change(int x){
        x = 1000;
        System.out.println("change : x  = "+x);
    }
}
