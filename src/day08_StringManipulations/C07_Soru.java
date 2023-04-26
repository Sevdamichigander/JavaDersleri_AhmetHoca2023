package day08_StringManipulations;

public class C07_Soru {
    public static void main(String[] args) {

        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis ___
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis____
        // 3- aradiginiz kelime cumlede hic kullanilmamis____
                    // contains/index("kelime") ile aratabilirsiniz. -1 donerse hic kullanilmadigini anlariz

   // Verilen cumle =

        String str1 = "Java cok kolay";
        String str2 = "cok";

    int bastanIndex = str1.indexOf(str2);
    int sondanIndex = str1.lastIndexOf(str2);



        if (bastanIndex == -1 ){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");

        }else if (bastanIndex == sondanIndex){ // demekki aradigim kelimeden sadece 1 tane var
                                            // esit degilse en az iki tane vardir.
            System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
        }
        else {
            System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");
        }
    }
}
