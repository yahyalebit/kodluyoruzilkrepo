import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, tip, tutar;
        double kmt = 0.10, cocuk = 0.50, genc = 0.10, yasli = 0.30, cift = 0.20;


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Yaşınızı Giriniz : ");
        yas = input.nextInt();
        while (yas <= 0 ) {
            System.out.print("Hatalı Seçim. Lütfen Tekrar Deneyin... : ");
            yas = input.nextInt();
        }

        System.out.print("Lütfen Gitmek İstediğiniz Yerin Mesafesini Girin (km) : ");
        km = input.nextInt();
        while (km <= 0) {
            System.out.print("Hatalı Seçim. Lütfen Tekrar Deneyin... : ");
            km = input.nextInt();
        }

        System.out.println("1- Tek Yön ");
        System.out.println("2- Gidiş-Dönüş");
        System.out.print("Lütfen Yolculuk Tipini Giriniz : ");
        tip = input.nextInt();

        while (tip > 2 || tip < 1) {
            System.out.print("Hatalı Seçim. Lütfen Tekrar Deneyin... : ");
            tip = input.nextInt();
        }

        tutar = (int) (km * kmt);

        if (yas < 12){
            tutar -= (int) (tutar * cocuk);
            if(tip == 2){
                tutar -= (int) (tutar * cift);
                tutar *= 2;
                System.out.print("Toplam Tutar = " + tutar + "TL");
            }else{
                System.out.print("Toplam Tutar = " + tutar + "TL");
            }
        }else if(yas <= 24){
            tutar -= (int) (tutar * genc);
            if(tip == 2){
                tutar -= (int) (tutar * cift);
                tutar *= 2;
                System.out.print("Toplam Tutar = " + tutar + "TL");
            }else{
                System.out.print("Toplam Tutar = " + tutar + "TL");
            }
        }else if(yas > 65){
            tutar -= (int) (tutar * yasli);
            if(tip == 2){
                tutar -= (int) (tutar * cift);
                tutar *= 2;
                System.out.print("Toplam Tutar = " + tutar + "TL");
            }else{
                System.out.print("Toplam Tutar = " + tutar + "TL");
            }
        }else{
            if(tip == 2){
                tutar -= (int) (tutar * cift);
                tutar *= 2;
                System.out.print("Toplam Tutar = " + tutar + "TL");
            }else{
                System.out.print("Toplam Tutar = " + tutar + "TL");
            }
        }
    }
}