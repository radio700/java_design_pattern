package JAVA_JUNG_SEOK.CH07.CH07_06;

class Parent{
    int x  = 10;
}

class Child extends Parent{
    int x = 20;

    void method(){
        System.out.println("x = "+x);
        System.out.println("this.x = "+this.x);
        System.out.println("super.x = "+super.x);//오!!!!!!
    }
}

class SuperTest2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
