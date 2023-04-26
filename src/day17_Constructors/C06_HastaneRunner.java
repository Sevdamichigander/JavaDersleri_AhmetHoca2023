package day17_Constructors;

public class C06_HastaneRunner {
    public static void main(String[] args) {

        C05_Hastane per1 = new C05_Hastane(); // once bu satir calisti.
        //C05 te  C05_Hastane() {
        //        System.out.println("parametresiz constructor calisti");
        //    }

        // bu kisim calisti.

        System.out.println(per1.personelIsmi); // Isim belirtilmedi
        System.out.println(per1.personelTelefon);//Telefon belirtilmedi
        System.out.println(per1.personelAdresi);//Adres belirtilmedi
        System.out.println(per1.personelTuru);//Personel turu belirtilmedi
        System.out.println(per1.maas());// default maasi atadi -- 1900
        per1.personelIsmi = "Adem";
        per1.personelAdresi = "Cankaya";
        per1.personelTelefon = "555213465987";
        per1.personelTuru = "Doktor";

        System.out.println(per1.personelIsmi); // Adem
        System.out.println(per1.personelTelefon);//
        System.out.println(per1.personelAdresi);//Cankaya
        System.out.println(per1.personelTuru);//Doktor
        System.out.println(per1.maas());// 5000

    }
}
