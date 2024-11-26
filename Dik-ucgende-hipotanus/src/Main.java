import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur.
        int a, b;
        double c;

        // Scanner sınıfını tanımla.
        Scanner inp = new Scanner(System.in);


        //Kullanıcıdan Kenarlar istenir.
        System.out.print("1. Kenarı girin : ");
        a = inp.nextInt();

        System.out.print("2. Kenarı girin : ");
        b = inp.nextInt();

        //Kareköke alma
        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs : " + c);

    }
}