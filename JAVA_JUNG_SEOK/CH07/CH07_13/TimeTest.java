package JAVA_JUNG_SEOK.CH07.CH07_13;

class Time{
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23){ return ;}
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59){ return ;}
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59){ return ;}
        this.second = second;
    }

    public String toString(){
        return hour+ ":"+ minute+ ":"+ second;
    }

    
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        t.setHour(t.getHour()+1);
        System.out.println(t);
        
    }
}
