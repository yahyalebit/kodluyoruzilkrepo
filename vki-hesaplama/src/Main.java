import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        double boy, kilo, vki;

        // Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan boy değerini metre cinsinden al
        System.out.print("Boyunuzu (metre cinsinden, örn: 1.75) girin: ");
        boy = inp.nextDouble();

        // Kullanıcıdan kilo değerini al
        System.out.print("Kilonuzu (kg cinsinden) girin: ");
        kilo = inp.nextDouble();

        // VKİ hesaplama formülü
        vki = kilo / (boy * boy);

        // VKİ sonucu ve durumun değerlendirilmesi
        System.out.println("Vücut Kitle İndeksiniz: " + vki);

        // Sağlık durumu değerlendirmesi
        if (vki < 18.5) {
            System.out.println("Sonuç: Zayıf");
        } else if (vki >= 18.5 && vki < 24.9) {
            System.out.println("Sonuç: Normal Kilolu");
        } else if (vki >= 25 && vki < 29.9) {
            System.out.println("Sonuç: Fazla Kilolu");
        } else {
            System.out.println("Sonuç: Obez");
        }
    }
}