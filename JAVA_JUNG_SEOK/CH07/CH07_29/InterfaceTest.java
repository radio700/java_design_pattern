package JAVA_JUNG_SEOK.CH07.CH07_29;

interface I{
    public abstract void methodB();
}

class A{
    void methodA(){
        I i = InstanceManager.getInstace();
        i.methodB();
        System.out.println(i.toString());
    }
}

class B implements I{

    @Override
    public void methodB() {
        System.out.println("method B in B class");
    }
    public String toString(){
        return "class B";
    }
}

class InstanceManager{
    public static I getInstace(){
        return new B();
        
    }
}



public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
    }
}
