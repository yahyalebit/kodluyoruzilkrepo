import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenler
        int r, a;
        double pi = 3.14, cevre, alan, merkezAci;

        // Scanner sınıfını tanımla.
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan r değerini al.
        System.out.print("Dairenin Yarıçap Değerini girin : ");
        r = inp.nextInt();
        inp.nextLine(); // Tampondaki satır karakterini temizle

        // Alan Hesaplama
        alan = pi * r * r;
        System.out.println("Dairenin Alanı : " + alan);

        // Çevre Hesaplama
        cevre = 2 * pi * r;
        System.out.println("Dairenin Çevresi : " + cevre);

        // Kullanıcıdan Merkez Açısını alın
        while (true) {
            System.out.print("Merkez Açı Bulmak İstiyorsanız 'y', İstemiyorsanız 'n' ye basıp devam edin. ");
            char choice = inp.nextLine().charAt(0); // Kullanıcıdan seçim alınır

            if (choice == 'y' || choice == 'Y') {
                System.out.print("Merkez Açısının Ölçüsünü Girin: ");
                a = inp.nextInt();
                inp.nextLine(); // Tampondaki satır karakterini temizle

                // Merkez Açı Alan Formülü
                merkezAci = ((pi * (r*r) * a) / 360);
                System.out.println("Merkez Açı Alanı : " + merkezAci);

                break; // Doğru seçim yapıldı, döngüden çık
            } else if (choice == 'n' || choice == 'N') {
                System.out.println("İşlem atlandı.");
                break; // Doğru seçim yapıldı, döngüden çık
            } else {
                System.out.println("Geçersiz giriş. Lütfen 'y' veya 'n' girin.");
            }
        }



    }
}