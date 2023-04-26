package day09_StringManipulation_Soru_ForLoops;

public class C08_ForLoopDikkatEdilecekler {
    public static void main(String[] args) {

        //  Verilen ilk deger bitis sartini saglamiyorsa ---
        //  kod calisti ama baslangic sartini saglamadigi icin loop body si hic calismaz
        //

        for (int i = 10; i < 0; i++) {
            System.out.println(i);


        }  // Baslangic degeri ve artis/azalis miktari ile bitis sarti hic saglanmazsa
        for (int i = 10; i >=0 ; i++) {
            System.out.println(i + " "); // siz durdurmazsaniz sonsuza kadar gider.Buna sonsuz loop denir.
            //Bilgisayarin ram i dolana kadar kod calisir.
        }



    }
}

