import java.util.Scanner;

// KDV Tutarı Kullanızı tercihine Bırakılmıştır

public class Main {
    public static void main(String[] args) {

        // Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        double fiyat, kdvOran;

        // Fiyat alınıyor
        System.out.print("KDV Uygulanacak Tutarı girin  : ");
        fiyat = inp.nextInt();

        // KDV Değeri Alınıyor
        System.out.print("Uygulanacak KDV Yüzdesini Girin  % : ");
        kdvOran = inp.nextInt();
        kdvOran = kdvOran / 100.0;

        //KDV Oranı Hesaplanıyor
        double kdvTutari = fiyat * kdvOran;

        // KDV'li Fiyat Hesaplanıyor
        double kdvFiyat = kdvTutari + fiyat;


        System.out.println("KDV'siz Fiyat : " + fiyat);
        System.out.println("KDV Oranı : " + (kdvOran));
        System.out.println("KDV'li Fiyat : " + kdvFiyat);
        System.out.println("KDV Tutarı : " + kdvTutari);

    }
}