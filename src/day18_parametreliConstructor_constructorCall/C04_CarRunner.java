package day18_parametreliConstructor_constructorCall;

public class C04_CarRunner {
    public static void main(String[] args) {

        C03_Car car1 = new C03_Car();
        System.out.println(car1); // toString methodu sayesinde yazdirabildik. Yoksa referans yazdirir.

        // Mecburi alan olarak fiyat ve marka doldurulsun

        C03_Car car2 = new C03_Car(12000, "Toyota");
        System.out.println(car2);//C03_Car{marka='Toyota', model='model belirtilmedi', yil=0, fiyat=12000}

        C03_Car car3 = new C03_Car(10000, "opel");//C03_Car{marka='opel', model='model belirtilmedi', yil=0, fiyat=10000}
        System.out.println(car3);

        //Constructor icinde bizim gonderdigimiz parametreler disinda baska islemler de olabilir
        // Kod okuma sorularinda constructor da ki atamalara dikkat edilmelidir!!!

        C03_Car car4 = new C03_Car("Honda"); //C03_Car{marka='Honda', model='Civic', yil=2000, fiyat=12000}
        System.out.println(car4);

        C03_Car car5 = new C03_Car("Volvo");//C03_Car{marka='Honda', model='Civic', yil=2000, fiyat=12000}
        System.out.println(car5);
        C03_Car car6 = new C03_Car("Nissan");// Bizim ne yolladigimizin hic onemi yok. C03 te ki atamalara bakiyor.
        System.out.println(car6);


    }
}
