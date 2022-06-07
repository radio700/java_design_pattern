package JAVA_JUNG_SEOK.CH07.CH07_18;

class Parent{
    int x = 100;

    void method(){
        System.out.println("조상 메쏘드");
    }
}

class Child extends Parent{
    int x = 200;
    int y = 300;

    void method(){
        System.out.println("자손 메쏘드");
    }
}

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = "+p.x);//호오.... 조상 참조 변수에 있는거는 확장 되더라도 쓸 수 있음 
        p.method();
        //System.out.println(p.y);//주석풀고 봐봐 안되자넘 조상 보다 메모리 확장된 자손은 조상 참조변수에 없는걸 쓸 수 없음

        System.out.println("c.x = "+c.x);
        c.method();
    }
}
