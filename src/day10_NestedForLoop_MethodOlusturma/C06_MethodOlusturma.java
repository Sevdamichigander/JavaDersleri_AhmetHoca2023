package day10_NestedForLoop_MethodOlusturma;

public class C06_MethodOlusturma {
    public static void main(String[] args) {
        String str = "Javanin robotlari";
        str.toUpperCase();
        System.out.println(str.toUpperCase()); // burda str i kaydettik

        // Eger bir method bize bir sonuc donduruyorsa
        // method'u calistirmak sonucu gormek icin yeterli DEGILDIR;

        // Sonucu illa da gormek istiyorsak
        // - ya direk methodCall'u sout icersinde yapariz
        // ya da donen bilgiyi bir variable a kaydeder
        // kodumuzda istedigimiz zaman onu yazdirir veya kullaniriz

        System.out.println(str.toUpperCase()); // burda da str i artik kaydettik


    }
}
