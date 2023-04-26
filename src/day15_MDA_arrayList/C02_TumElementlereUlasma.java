package day15_MDA_arrayList;

public class C02_TumElementlereUlasma {
    public static void main(String[] args) {

        int[][] arr = {{1, 5, 9}, {3, 4}, {2, 8, 1, 2}, {10}};

        // tek katli array de for loop olusturuyorduk.
        // arr[i] bize tum elementleri getiriyordu.
        // MDA olunca kat sayisinca icice loop olusturmak gerekir.
        // Bizim sorumuzda 2 loop olusturacagiz.
        // arr[i][j] bize tum elementleri getirecek.

        // Tum elementleri aralarinda bir bosluk birakarak yanyana yazdiralim.

        for (int i = 0; i < arr.length; i++) {// outer loop u kontrol edecek. arr[0],arr[1]....
            for (int j = 0; j < arr[i].length; j++) {//inner loop u kontrol edecek.

                System.out.print(arr[i][j] + " ");//1 5 9 3 4 2 8 1 2 10

                // sayilar ve elementleri sort edebiliriz ama arrayleri sort edemeyiz

            }


        }
        System.out.println(" ");

        // tum elementlerin(for loop) toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                toplam += arr[i][j];

            }

        }

        System.out.println("Tum elementlerin toplami : " + toplam);//Tum elementlerin toplami : 45
        System.out.println(" ");

        // MDA deki en buyuk elementi yazdirin

        int enBuyukSayi = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]> arr[0][0]) {
                    enBuyukSayi = arr[i][j];

                }
            }

        }
        System.out.print("en buyuk element : " + enBuyukSayi);
        System.out.println(" ");

        //MDA da ki cift sayilari yan yana yazdirin

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0) {
                    System.out.println("cift sayilar :" + arr[i][j] + " ");
                }


            }
        }
    }
}