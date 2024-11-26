import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fiyatlar
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;

        // Kullanıcıdan ürünlerin kilogram değerlerini al
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut (kg) miktarını girin: ");
        double armutKg = inp.nextDouble();

        System.out.print("Elma (kg) miktarını girin: ");
        double elmaKg = inp.nextDouble();

        System.out.print("Domates (kg) miktarını girin: ");
        double domatesKg = inp.nextDouble();

        System.out.print("Muz (kg) miktarını girin: ");
        double muzKg = inp.nextDouble();

        System.out.print("Patlıcan (kg) miktarını girin: ");
        double patlicanKg = inp.nextDouble();

        // Hesaplamalar
        double armutToplam = armutKg * armutFiyat;
        double elmaToplam = elmaKg * elmaFiyat;
        double domatesToplam = domatesKg * domatesFiyat;
        double muzToplam = muzKg * muzFiyat;
        double patlicanToplam = patlicanKg * patlicanFiyat;

        // Toplam tutarı hesapla
        double toplamTutar = armutToplam + elmaToplam + domatesToplam + muzToplam + patlicanToplam;

        // Sonuçları ekrana yazdır
        System.out.println("\n--- Fatura ---");
        System.out.printf("Armut: %.2f kg x %.2f TL = %.2f TL\n", armutKg, armutFiyat, armutToplam);
        System.out.printf("Elma: %.2f kg x %.2f TL = %.2f TL\n", elmaKg, elmaFiyat, elmaToplam);
        System.out.printf("Domates: %.2f kg x %.2f TL = %.2f TL\n", domatesKg, domatesFiyat, domatesToplam);
        System.out.printf("Muz: %.2f kg x %.2f TL = %.2f TL\n", muzKg, muzFiyat, muzToplam);
        System.out.printf("Patlıcan: %.2f kg x %.2f TL = %.2f TL\n", patlicanKg, patlicanFiyat, patlicanToplam);

        System.out.printf("\nToplam Tutar: %.2f TL\n", toplamTutar);
    }
}
