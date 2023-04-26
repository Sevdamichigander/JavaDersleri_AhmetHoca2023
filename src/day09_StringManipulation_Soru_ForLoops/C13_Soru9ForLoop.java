package day09_StringManipulation_Soru_ForLoops;

public class C13_Soru9ForLoop {

    public static void main(String[] args) {
        // Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        String str = "Java coooook guzel";

        // Once son harften baslayarak geriye dogru tek tek yazdiririz

        for (int i = (str.length()-1); i >=0 ; i--) { //(str.length()-1) ==> son index

            System.out.print(str.substring(i,i+1));

        }

        // String in ters halini yeni bir string olarak kaydedin
        String tersStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr += str.substring(i, i+1);

        }
        System.out.println("\nTers haliyle kaydedilen metin : " + tersStr);
    }
}
