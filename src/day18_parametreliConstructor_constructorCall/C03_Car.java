package day18_parametreliConstructor_constructorCall;

public class C03_Car {


    String marka = "marka belirtilmedi";
    String model = "model belirtilmedi";
    int yil;
    int fiyat;

    /*
    public C03_Car(String marka, String model, int yil, int fiyat){

        this.marka = marka; // this. ==> bu class ta ki markanin degeri benim yolladigim marka degeri olsun demek
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;

    }
*/

    public C03_Car(int fyt, String mrk){
        fiyat = fyt;
        marka=mrk;

    }
    public C03_Car(String mrk){
        marka="mrk";
        //fiyat=12000;
        //model="Civic";
        //yil=2000;

    }
    public C03_Car(){

    }


    public C03_Car(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    // marka ve model ile constructor olusturualim code-generate-Constructor-choisir marka model

    public C03_Car(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    @Override
    public String toString() {
        return "C03_Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
