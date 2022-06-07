package JAVA_JUNG_SEOK.CH06.CH06_29;

class Product {

    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }
    //↑ 인스턴스 초기화 블럭 (인스턴스가 생성 될 때 마다 로직을 탄다)

    public Product(){}

}

public class ProductTest{
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1제품 번호 는 "+p1.serialNo);
        System.out.println("p1제품 번호 는 "+p2.serialNo);
        System.out.println("p1제품 번호 는 "+p3.serialNo);
    }
}
