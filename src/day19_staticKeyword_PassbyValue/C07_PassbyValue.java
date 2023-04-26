package day19_staticKeyword_PassbyValue;

import java.util.Arrays;

public class C07_PassbyValue {

        public static void main(String[] args) {


            int[] arr = {10,12,23};

            // verilen array'in tum elementlerini 3 artirip yazdiran bir method olusturun

            elemanlariArtir(arr);

            System.out.println("method call'dan sonra arr : " + Arrays.toString(arr));
        }

        public static void elemanlariArtir(int[] arr){
            for (int i = 0; i < arr.length ; i++) {
                arr[i] = arr[i] + 3;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
