import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select, sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz : ");
        n1 = inp.nextInt();

        System.out.print("2. Sayıyı Girin : ");
        n2 = inp.nextInt();

        System.out.println("1-Toplama İşlemi\n2-Çıkarma İşlemi\n3-Çarpma İşlemi\n4-Bölme İşlemi");
        System.out.print("Seçiniz : ");
        select = inp.nextInt();

        while (select > 4 || select < 1){
            System.out.print("Hatalı Seçim. Lütfen Tekrar Deneyin... : ");
            select = inp.nextInt();
        }

        switch (select) {
            case 1:
                sonuc = (n1 + n2);
                System.out.print("Sonuç : " + sonuc);
                break;
            case 2:
                sonuc = (n1 - n2);
                System.out.print("Sonuç : " + sonuc);
                break;
            case 3:
                sonuc = (n1 * n2);
                System.out.print("Sonuç : " + sonuc);
                break;
            case 4:
                while (n2 == 0) {
                    System.out.print("Bu İşlem İçin Geçersiz değer. 2. Sayıyı Tekrar Girin : ");
                    n2 = inp.nextInt();
                }
                sonuc = (n1 / n2);
                System.out.print("Sonuç : " + sonuc);
                break;
            default:
                /////////////////
                break;
        }
    }
}