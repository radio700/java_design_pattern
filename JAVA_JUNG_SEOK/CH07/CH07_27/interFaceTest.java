package JAVA_JUNG_SEOK.CH07.CH07_27;

class A{
    public void methodA(B b){
        b.methodB();
    }
}
//클래스 A는 클래스 B의 인스턴스를 생성하는 메쏘드를 가지고 있다
//하지만 클래스 B의 프로퍼티가 변경되거나 하면 클래스 A를 다시 써야 하는 번거로움이 있다 그래서 다음장에서
//implement를 통해 분리하는 작업을 해 보겠다

class B{
    public void methodB(){
        System.out.println("method B");
    }
}

public class interFaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}
