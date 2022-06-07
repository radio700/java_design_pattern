package JAVA_JUNG_SEOK.CH07.CH07_04;

class TV {
    Boolean power;
    int ch;

    void power(){ power = !power;}
    void chUP(){ ++ch; }
    void chDOWN(){ --ch; }
}

class VCR {
    Boolean power;
    int counter = 0;

    void power(){ power = !power; }
    void play(){}
    void stop(){}
    void rew(){}
    void ff(){}

}

public class TVCR extends TV{
    VCR vcr = new VCR();

    void play(){
        vcr.play();
    }

    void stop(){
        vcr.stop();
    }

}
