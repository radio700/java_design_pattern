package JAVA_JUNG_SEOK.CH07.CH07_28;

interface I{
    public abstract void play();
}

class A{
    void autoPlay(I i){//인터페이스, 클래스를 파라미터로 받네? -> 다시 말해서 I를 받는 모든 클래스를 호출 할 수 있는거지!!
        i.play();//실제 I에 접근 했지 B에 접근하진 않았다
    }
}

class B implements I{

    @Override
    public void play() {
        System.out.println("play in B class");
    }
}

class C implements I{

    @Override
    public void play() {
        System.out.println("play in C class");
    }
}
public class Interfacetest2 {
    public static void main(String[] args) {
        A a = new A();
        a.autoPlay(new B());
        a.autoPlay(new C());
    }
}
