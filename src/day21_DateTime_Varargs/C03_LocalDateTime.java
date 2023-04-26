package day21_DateTime_Varargs;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ts = LocalDateTime.now();
        System.out.println(ts);//2023-04-25 T 11:05:04.346104600

        // tarih ve saati su sekilde yazdirin 25/04/2023 11:04

        System.out.println(ts.getDayOfMonth() + "/" + ts.getMonthValue()+"/" +
                ts.getYear()+" "+ts.getHour()+":" + ts.getMinute());//25/4/2023 11:8

        System.out.println(ts.plusHours(100));//100 saat sonra tarih ==> 2023-04-29T15:09:49.003885900




    }
}
