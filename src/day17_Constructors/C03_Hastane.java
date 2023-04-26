package day17_Constructors;

public class C03_Hastane {

    static String hastaneAdi = "Yildiz Hastanesi";// herkes icin gecerli old static yaptik
    static String hastaneTelefonu = "031245632123";

    String personelIsmi = "Isim belirtilmedi";// her bir obje icin birbirinden bagimsiz olmali
    String personelAdresi = "Adres belirtilmedi";
    String personelTelefon = "Telefon belirtilmedi";
    String personelTuru = "Personel turu belirtilmedi";

    public int maas(String personelTuru){

        switch(personelTuru){

            case "Doktor" :
                return 5000;

            case "Hemsire" :
                return 3000;

            case "Bashemsire":
                return 4000;

            default:
                return 1900;
        }
    }
}
