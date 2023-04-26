package day21_DateTime_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         a yazarsak AM veya PM degerini yazar
         */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMMM/YYYY hh:mm a");//format olusturduk
        LocalDateTime ts = LocalDateTime.now();

        System.out.println(ts);//2023-04-25T11:18:02.888779

        System.out.println(ts.format(dtf1));//25/avril/2023 11:18 AM

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd.MM.YY HH:m a");

        System.out.println(ts.format(dtf2));//25.04.23 11:21 AM
    }
}
