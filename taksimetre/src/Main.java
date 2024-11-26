import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler
        int km,  startPrice;
        double perKm = 2.20, total;

        // Scanner sınıfını tanımla.
        Scanner inp = new Scanner(System.in);

        System.out.print("KM girin : ");
        km = inp.nextInt();

        System.out.print("Açılış Ücreti Girin : ");
        startPrice = inp.nextInt();

        total = (km * perKm);
        total += startPrice;

        boolean indiBindi = total >= 20;
        System.out.println("Ücret: " + (indiBindi ? total : 20));
    }
}