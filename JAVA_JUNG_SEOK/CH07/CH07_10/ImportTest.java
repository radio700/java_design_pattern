package JAVA_JUNG_SEOK.CH07.CH07_10;

import java.text.SimpleDateFormat;
import java.util.Date;

class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy_MM_dd");
        SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");

        System.out.println("오늘 날짜는 -> "+date.format(today));
        System.out.println("지금 시간은 -> "+time.format(today));
    }
}
