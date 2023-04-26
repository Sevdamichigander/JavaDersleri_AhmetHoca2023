package day12_WhileLoop_DoWhileLoop_Scope;

public class C05_LocalVariables {
    public static void main(String[] args) {
         /*

   Variable in scope u ==> bir variable nerelerden kullanilabilir demek
   icinde bulundugumuz scope ne ==> icinde bul. sinirlari tanimlamak icin kullaniriz

   local variable ==> bir method un  yada bir kod un icinde olusturulanlardir

   her method un icinde variable olusturulabilir

            Kural 1 : Local variable lar sadece kendi scopelarinda gecerlidir.
                      Bir methodda olusturulan local variable baska methodda kullanilamaz.
            Kural 2 : Local bir scope ta (bir methodun ya da kod blogunu icinde) deger atamadan local variable olusturabilirsiniz.
                      Ancak deger atamadan local variable lari kullanamazsiniz(yazdiramazsiniz).
            Kural 3 : Bir loop icerisinde olusturulan variable lar sadece o loop icerisinde gecerlidir.
                     O loop disinda kullanilamaz. Vegas ta olan vegas ta kalir! Bunlara loop variable da denir.

     */
        int sayi = 10;
        // str = "java candir"; // kullanilamaz
        String slogan  ="Java candir";
        slogan = "Java hayattir";
        String s;
        //System.out.println(s); // Hata verir. Variable 's' might not have been initialized(Deger atanmamis olabilir)

        for (int i = 0; i <10 ; i++) {
            int sayi2 = 10;
            System.out.println(sayi2+i);

        }
        // for loop icerisinde i ve sayi2 isminde 2 local variable olusturulmustur.
        // Loop disinda bunlari kullanalim==> kullanamayiz. Sadece for loop icinde kullanilabilir
       // i = 20;
       // System.out.println(i);
       // sayi2

    }

   public static void staticMethod(){
        String str = "java mululuktur";


   }
   public void staticOlmayanMethod(){
        boolean yeterMi = true;

   }
}
