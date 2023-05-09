package day12_WhileLoop_DoWhileLoop_Scope;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        - Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir
         */

        Scanner scan = new Scanner(System.in);
        String sifre;
        boolean sifreGecerliMi = false;
        int sayac = 0;


        do {
            System.out.println("Lutfen sifrenizi giriniz : ");
            sifre = scan.nextLine();

            boolean hasLowerCase = false;
            boolean hasUpperCase = false;
            boolean hasSpecialChar = false;

            if (sifre.length()>=8){
                for (int i = 0; i < sifre.length(); i++) {
                    char c = sifre.charAt(i);
                    /*
                    sifre.charAt(i) kodu, sifre adlı bir String değişkenin i indisindeki karakteri alır.
                     charAt() metodu, belirtilen indeksdeki karakteri alır ve onu char türünde bir değer olarak döndürür.
                     Yani bu satır, şifrenin her bir karakterini döngü içinde tek tek kontrol eder
                     ve c adlı bir char değişkenine atar. Daha sonra bu karakterin küçük harf, büyük harf veya
                     özel karakter olup olmadığını kontrol etmek için if koşullarında kullanılır.

                    Örneğin, sifre değişkeni "MyPassword123!" olsun ve i değişkeni 0 olsun.
                    O zaman, sifre.charAt(i) ifadesi, sifre değişkeninin ilk karakterini,
                     yani 'M' karakterini döndürür ve c değişkenine atar.
                     Bu karakter daha sonra büyük harf olup olmadığını kontrol etmek için if koşullarında kullanılır.
                     */
                    if (Character.isLowerCase(c)) {
                        hasLowerCase = true;
                    } else if (Character.isUpperCase(c)) {
                        hasUpperCase = true;
                    } else if (!Character.isLetterOrDigit(c)) {
                        hasSpecialChar = true;
                    }
                }
                if (hasLowerCase && hasUpperCase && hasSpecialChar) {
                    sifreGecerliMi = true;
                } else {
                    System.out.println("Şifreniz yanlış! Şifreniz en az 8 karakter, büyük harf, küçük harf ve özel karakter içermelidir.");
                }
            } else {
                System.out.println("Şifreniz yanlış! Şifreniz en az 8 karakter, büyük harf, küçük harf ve özel karakter içermelidir.");
            }
        } while (!sifreGecerliMi);

        System.out.println("Şifreniz kabul edilmiştir!");

    }
}
