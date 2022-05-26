package JAVA_JUNG_SEOK.CH06;

public class Main {
    String color;
    boolean power;
    int channel;// 4바이트로 끊어 읽어라 or 4바이트 짜리 구멍을 뻥 뚫어줌

    void power(){
        power =! power;
    }

    void chnnelUp(){
        ++channel;
    }

    void channelDown(){
        --channel;
    }


    public static void main(String[] args) {
        Main t;// 이게 String color 같은 거네!! 클래스 타입의 참조변수 t를 선언한다

        new Main();
        // new Main 이라는 참조값를 생성한다 {네모 생각 할 것 자바정석238p}
        // Main의 새 인스턴스를 만든다 이때 String은 null bool은 false int는 0으로 생성된다
        // power() chnnelUp() channelDown()으로 초기화된 메쏘드가 만들어 진다

        t = new Main(); 
        // System.out.print("\n   "+t+"     \n"); 
        // Main이라는 인스턴스의 주소 값을 t라는 변수에 넣는거네요
        // 다른말로 Main 인스턴스의 참고 값을 t라는 참조변수에 넣는 것이고
        // 15db9742 <- 현재 인스턴스의 (c++로 치면)메모리 주소 == 참조값 
        // [[참조변수 t는 Main이라는 인스턴스를 가리키고 있다]] <- 정확하게 읽었음

        // 뭐 싯팔 어렵게 해석하지 말고  t라는 [참조]변수에 new Main() [참조]값이 할당 됐다 하면 되자나
        // t를 포인터로 생각하면 또 편함 t는 new Main()이 생성된 주소 값을 가지고 있음

        t.channel = 7; 
        // t라는 포인터(java:참조변수)를 통해서 JAVA_JUNG_SEOK.CH06.Main@15db9742 에 있는 인스턴스(객체)
        // 의 property에 접근해서 7을 저장한다 공식은 [참조변수.프로퍼티]

        // 포인터, 참조변수(!=참조) 모두 주소를 통해 원본 데이터에 접근하는 공통 기능을 가진다.
        // 다만, 포인터는 메모리를 직접 핸들링할 수 있지만 참조는 메모리를 직접 핸들링할 수 없다는 차이점이 존재한다.
        // 또한 C++, C#에서는 메모리 주소를 바로 주는 반면 자바는 메모리 주소 대신 참조값(참조값)를 준다
        // 포인터는 (주소 값을 임의의 메모리 주소로 변경할 수 [있]다). 
        // 참조변수는 (주소 값을 임의의 메모리 주소로 변경할 수 [없]다). 
        // 만약 개발자가 실수로 주소 값을 변경해버리면 segment fault 같은 문제가 발생할 가능성이 생기게 된다.
        // 하지만 참조변수는 직접 메모리에 접근이 불가능 따라서 주소 값을 임의의 메모리 주소로 변경할 수 없다.
        // 물론 직접적으로 메모리에 접근이 불가능한 것이지 new 키워드로 인스턴스를 생성한 경우 내부적으로는 메모리 주소에 접근할수있다.
        // 즉, 포인터를 사용하면 유연성과 성능을 향상시킬 수 있지만 안정성이 떨어지기 때문에 Java에서는 포인터라는 개념을 제거하였다.
        
        t.channelDown();//[참조변수.메쏘드]
        //참조변수 t가 참조하고 있는 인스턴스의 channelDown 이라는 메소드를 호출한다 그림 꼭 생각할 것 자바정석236p

        System.out.println("현재 채널은 "+t.channel+" 입니다");
        //레퍼런스 t가 참조하고 있는 인스턴스의 channel이라는 property 값을 출력한다

        //★인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야 한다
    }

    
}
