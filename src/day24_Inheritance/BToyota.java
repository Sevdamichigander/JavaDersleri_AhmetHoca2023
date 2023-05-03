package day24_Inheritance;

public class BToyota extends Araba{

    String marka = "Toyota";
    String uretimYeri = "uretim yeri belirtilmedi";
    String lastik = "Toyota araclar pirelli lastikleri kullanir";

    public void guvenlik(){
        System.out.println("Toyota araclar ekstra guvenlik donanimlarina sahiptir");
    }
    public void aku(){
        System.out.println("Toyota araclar inci aku kullanir");
    }

}
