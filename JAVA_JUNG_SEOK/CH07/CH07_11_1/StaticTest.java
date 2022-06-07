package JAVA_JUNG_SEOK.CH07.CH07_11_1;

class StaticTest {
    static int width  = 200;
    static int height = 120;

    static {
        //static 클래스 초기화 블럭
    }

    static int max(int a, int b){//static 메쏘드
        return a > b ? a: b;
    }
}
