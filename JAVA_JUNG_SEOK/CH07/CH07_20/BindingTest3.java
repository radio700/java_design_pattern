package JAVA_JUNG_SEOK.CH07.CH07_20;

class Parent{
    int x = 100;

    void method(){
        System.out.println("조상 메쏘드");
    }
}

class Child extends Parent{
    int x = 200;

    void method(){
        System.out.println("x = "+x);
        System.out.println("super.x = "+super.x);
        System.out.println("this.x = "+this.x);
    }
}

public class BindingTest3 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
    
        System.out.println("p.x = "+p.x);//호오....
        p.method();
        System.out.println();

        System.out.println("c.x = "+c.x);
        c.method();
    }
}
