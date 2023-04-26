package day17_Constructors;

public class C04_HastaneRunner {

    public static void main(String[] args) {
        C03_Hastane per1 = new C03_Hastane();

        System.out.println(per1.personelIsmi);// Isim belirtilmedi

        // Burda artik C03 e gidip veri almaz.
        // Obje olusturulurken per1 e kopyalanan degerleri kullanir.
        // CO3 te ki degerler sadece baslangic icin gecerlidir.


        per1.personelTuru = "Doktor";
        System.out.println(per1.maas(per1.personelTuru));//5000

        // Biz bir obje olusturdugumuzda java once bu constructor un varligini teyit eder.
        // Constructor varsa istenen objeyi olusturur.
        //Obje olusturulunca instance olan butun variable larin birer kopyalarini olusturur ve
        // bu objeye ilisiklendirir

        // Objeye yeni bir atama yapmadigimiz muddetce
        // objenin olusturuldugu class ta ki ilk degerleri kullanir.

        /*
        Obje uzerinden static variable lara ulasmak istedigimizde
        !!!!   java once objeye gider, o objeye ilisiklendirilen bilgilerde
        istenen variable i bulamazsa class seviyesinde static variable lara ulasir.

        static variable lar class a baglidir
        ve degistirilirse tum objeler icin degisiklik gecerli olur.

         */



        C03_Hastane per2 = new C03_Hastane();

        System.out.println(per2.personelTuru);//Personel turu belirtilmedi

        // static variable lar objeye bagli cikmaz. Cunku class a baglidirlar.

        System.out.println(per1.hastaneAdi);
        // once per1 e gider. hastaneAdi yok. Ama onun bagli oldugu class ta var ve degeri "Yildiz".
        // Dolayisiyla Yildiz yazdirir.

        per2.hastaneAdi="Java Hastanesi";

        System.out.println(per1.hastaneAdi); // Java Hastanesi

    }

}
