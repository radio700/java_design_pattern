package JAVA_JUNG_SEOK.CH07.CH07_17;

class Car{}

class FireEngine extends Car{}

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine){
            System.out.println("이거슨 파이어엔진의 인스턴스입니다");
        }
        if(fe instanceof Car){
            System.out.println("이거슨 카의 인스턴스입니다");
        }
        if(fe instanceof Object){
            System.out.println("이거슨 오브젝트의 인스턴스입니다");
        }
        System.out.println(fe.getClass().getName());//클래스 이름 출력
        //다시말해 FireEngine은 car로 형변환, object로 형 변환이 가능하다는 말!!
    }
}
