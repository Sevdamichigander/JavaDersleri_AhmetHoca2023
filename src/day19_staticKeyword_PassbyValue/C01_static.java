package day19_staticKeyword_PassbyValue;

public class C01_static {
    static String staticV = "Java candir"; // Her yerden ulasilabilir
    String instanceV= "Selenium heyecandir";

    public static void main(String[] args) {

        staticV="Java hayattir";
        staticMethod(); // Her yerden kullanilabilir
        // System.out.println(instanceV); // instance i burada kullanamayiz. Cunku method static
        // dolayisiyle static olmayanlari kabul etmiyor.


    }
    public static void staticMethod(){

        System.out.println("Static method calisti");
        System.out.println(staticV);
        staticMethod();
    }
    public void staticOlmayanMethod(){
        System.out.println("Static olmayan method calisti");
        System.out.println(staticV);
        staticMethod();
        System.out.println(instanceV);// instanceV static degil/ayricalikli degil dolayisiyla burda kullanilabilir
    }
}
