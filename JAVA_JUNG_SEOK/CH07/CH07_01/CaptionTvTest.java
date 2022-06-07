package JAVA_JUNG_SEOK.CH07.CH07_01;

class TV{

    Boolean power;
    int channel;

    void power(){ 
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}

class CaptionTV extends TV{
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}


public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTV ctv = new CaptionTV();
        ctv.channel=10;

        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("안녕 세상");

        //tv켜자

        ctv.caption = true;
        ctv.displayCaption("안녕 세상(이제 켜 지나?)");
    }
}
