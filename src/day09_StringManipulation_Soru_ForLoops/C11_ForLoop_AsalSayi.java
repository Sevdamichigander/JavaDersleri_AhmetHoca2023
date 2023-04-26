package day09_StringManipulation_Soru_ForLoops;

public class C11_ForLoop_AsalSayi {
    public static void main(String[] args) {
        //Verilen bir sayinin asal sayi olup olmadigini yazdirin
        
        int sayi = 65;
        boolean asalMi = true;

        for (int i = 2; i <sayi; i++) {

            if(sayi % i ==0){
                asalMi = false;
                break; // Buraya geldiginde bir tane bolen sayi varsa asalMi false olur
                        // ve loop burdan sonra devam etmez.
                        // break koymazsak en sona kadar butun sayilari deneyip oyle sonucu verir/
                /*
                Bir loop un icerisinde loop'un calismasini durdurmak isterseniz break; yazabilirsiniz
                 */
            }
        }

        /*
        Bir loop un icerisinde loop un calismasini durdurmak isterseniz break yazabilirsiniz.
         */
        if(asalMi) System.out.println("sayi asal");
        else System.out.println("sayi asal degil");
    }
}
