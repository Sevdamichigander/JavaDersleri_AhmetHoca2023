package day22_StringBuilder_AccessModifier;

public class C05_accessModifier {

    protected C05_accessModifier(){


    }

    private String privateStr;
    String defaultStr;
    protected String protectedStr;
    public String publicStr;

    private static int privateStaticSayi;
    static int defaultStaticSayi;
    protected static int protectedStaticSayi;
    public static int publicStaticSayi;

    private void privateMethod(){

    }
    void defaultMethod(){

    }
    protected void protectedMethod(){

    }
    public void publicMethod(){

    }
    private static void privateStaticMethod(){

    }
    static void defaultStaticMethod(){

    }
    protected static void protectedStaticMethod(){

    }
    public static void publicStaticMethod(){
        //tum static class uyeleri direk kullanilabilir
        // static olmayan tum class uyeleri icin ise obje olustuurlmasi gerekir

        C05_accessModifier obj = new C05_accessModifier();
        System.out.println(obj.privateStr);
        obj.defaultStaticMethod();
        // static class uyelerini obje uzerinden kullanmaya gerek yoktur
        // ama kullanmak istersek java itiraz etmez




    }

    public void classUyeKullanimi(){
        // static olan veya olmayan tum class uyeleri burda kullanilabilir.
        // cunku static lerin gecis ustunlugu var

        System.out.println(privateStaticSayi);
        publicStaticMethod();

        System.out.println(protectedStr);
        protectedMethod();



    }
}
