package day17_Constructors;

public class OncekiGundenAklimizdaKalanlar {
    /*
    1- Constructor : Bir class tan deger olusturup ilk deger atamasi icin o class dan bir const calismalidir
    2- method a benzer ama method degildir. Constructor constructor dir.
    3- Bi her yeni olusturdugumuz class ta constructor olusturmak zorunda degiliz.
    Cunku java olusturulan her yeni class a obje olusturulabilmesi icin default constructor koyar.
    4- Default const. gorunmez/ parametresi yoktur/  body si bostur.
    5- Biz parametresi veya parametreli bir const olusturdugumuzda default const u siler/
    Yani gorunur bir const varsa default constructor yoktur.
    6- Bir kod blogunun constructor olabilmesi icin 2 sart saglanmalidir.
        - Ismi class ismi ile birebir ayni olmalidir.(case sensitive olarak)
        - return type olmamalidir. (return type varsa method olabilir ama kesinlikle const degildir.)
    7- Bir class ta farkli constructorlar olabilir. (Method overloading gibi signature lari farkli olmalidir.)
    8- Biz default constructor i kullanarak bir obje olusturdugumuzda
     java once constructor in varligini kontrol eder.
    Sonra objeyi olusturur ve obje olusturulan class ta ki tum instance variable larin bir kopyasini olusturup
     objeye ilisiklendirir.
    9- Constructor calistiktan sonra obje uzerinde yapilan degisiklikler
     objenin olusturuldugu class ta ki instance variable lara degil
      objeye ilisiklendirilen kopya instance variable lara kaydedilir.



     */
}
