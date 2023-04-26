package day19_staticKeyword_PassbyValue;

public class C02 {

    static String staticV="Java";
    String isimInstance = "Sevda";

    public static void main(String[] args) {
        C02 obj1 = new C02(); // obje olusturduk. Java boyle bir constructor var mi diye kontrol ediyor.
                                // Gorunurde yoksa default devreye girer.

        System.out.println(obj1.isimInstance); // Sevda
        System.out.println(obj1.staticV);//Java ==> staticV objeye ait degil. class a bagli oldugu icin class a yapisiktir.
        obj1.isimInstance = "Akif";
        System.out.println(obj1.isimInstance); // Akif

        C02 obj2 = new C02(); // obj2 objesi olusuyir
        System.out.println(obj2.isimInstance); // Sevda
        System.out.println(obj2.staticV);// Java

        obj2.isimInstance = "Ayse";
        obj2.staticV = "Hava";

        System.out.println(obj1.isimInstance);//Akif
        System.out.println(obj1.staticV);//Hava
        System.out.println(obj2.isimInstance);//Ayse
        System.out.println(obj2.staticV);//Hava

        // Herhangi bir anda static variable lari yazdirdigimizda
        // (hatta objeye bagli olmaksizin direk yazdirdigimizda bile )
        // class level daki degeri yazdirir. Tum objeler icin aynidir.
        // Ama instancelar icin degisebilir


    }

}
