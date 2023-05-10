package day27_Overriding_Polymorphism_AbstractClasses;

public class C05_Nissan extends C03_Araba{
    /*
    Abstract class'lar yokken class'larimiza ozel bir isim vermemistik.
    Ama abstract class lar devrey girince class turunu belirtmek icin
     abstract olmayan class lara Concrete class denir.

     Bugune kadar bizim olusturdugumuz tum class lar concrete class idi.

     Concrete class veya methodlara concrete yazilmaz.
     Sadece class veya methoddan bahsedilirken abstract olmadigini vurgulamak icin
      concrete class ya da method deriz.

     */


    @Override
    void teker() {
        System.out.println("Nissan araclar lassa kullanir");
    }
    @Override
    void motor() {
        System.out.println("Nissan araclar renault motor kullanir");
    }
    @Override
    void gosterge() {
        System.out.println("Nissan araclarda 20 tane gosterge vardir");
    }
    public static void main(String[] args) {

        C05_Nissan nissan1 = new C05_Nissan();
        nissan1.gosterge(); // Nissan araclarda 20 tane gosterge vardir
        nissan1.guvenlik(); // parent - Arabalarin guvenlik onlemleri olsa iyi olur
        nissan1.klima(); // parent - Arabalarin klimalari olabilir
        nissan1.motor(); // Nissan araclar renault motor kullanir
        nissan1.teker(); // Nissan araclar lassa kullanir

        C03_Araba nissan2 = new C05_Nissan();
        nissan2.gosterge(); // Nissan araclarda 20 tane gosterge vardir
        nissan2.guvenlik(); // parent - Arabalarin guvenlik onlemleri olsa iyi olur
        nissan2.klima(); // parent - Arabalarin klimalari olabilir
        nissan2.motor(); // Nissan araclar renault motor kullanir
        nissan2.teker(); // Nissan araclar lassa kullanir
    }

}
