import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        float mat, fizik, kimya, turkce, muzik;
        int mat1, mat2, fizik1, fizik2, kimya1, kimya2, turkce1, turkce2, muzik1, muzik2;

        // Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.print("Matematik İlk Notunuz : ");
        mat1 = inp.nextInt();
        while (mat1 < 0 || mat1 > 100) {
            System.out.print("Geçersiz Not. Tekrar Girin : ");
            mat1 = inp.nextInt();
        }
        System.out.print("Matematik İkinci Notunuz : ");
        mat2 = inp.nextInt();
        while (mat2 < 0 || mat2 > 100) {
            System.out.print("Geçersiz Not. Tekrar Girin : ");
            mat2 = inp.nextInt();
        }
        mat = (mat1 + mat2) / 2f;


        //Fizik
        System.out.print("Fizik İlk Notunuz : ");
        fizik1 = inp.nextInt();
        while (fizik1 < 0 || fizik1 > 100) {
            System.out.print("Geçersiz Not. Tekrar Girin : ");
            fizik1 = inp.nextInt();
        }
        System.out.print("Fizik İkinci Notunuz : ");
        fizik2 = inp.nextInt();
        while (fizik2 < 0 || fizik2 > 100) {
            System.out.print("Geçersiz Not. Tekrar Girin : ");
            fizik2 = inp.nextInt();
        }
        fizik = (fizik1 + fizik2) / 2f;


        //Kimya
        System.out.print("Kimya İlk Notunuz : ");
        kimya1 = inp.nextInt();
        while (kimya1 < 0 || kimya1 > 100) {
            System.out.print("Geçersiz Not. Tekrar Girin : ");
            kimya1 = inp.nextInt();
        }
        System.out.print("Kimya İkinci Notunuz : ");
        kimya2 = inp.nextInt();
        while (kimya2 < 0 || kimya2 > 100) {
            System.out.print("Geçersiz Not. Tekrar Girin : ");
            kimya2 = inp.nextInt();
        }
        kimya = (kimya1 + kimya2) / 2f;


        //Turkce
        System.out.print("Turkce İlk Notunuz : ");
        turkce1 = inp.nextInt();
        while (turkce1 < 0 || turkce1 > 100) {
            System.out.print("Geçersiz Not. Tekrar Girin : ");
            turkce1 = inp.nextInt();
        }
        System.out.print("Turkce İkinci Notunuz : ");
        turkce2 = inp.nextInt();
        while (turkce2 < 0 || turkce2 > 100) {
            System.out.print("Geçersiz Not. Tekrar Girin : ");
            turkce2 = inp.nextInt();
        }
        turkce = (turkce1 + turkce2) / 2f;


        //Muzik
        System.out.print("Muzik İlk Notunuz : ");
        muzik1 = inp.nextInt();
        while (muzik1 < 0 || muzik1 > 100) {
            System.out.print("Geçersiz Not. Tekrar Girin : ");
            muzik1 = inp.nextInt();
        }
        System.out.print("Muzik İkinci Notunuz : ");
        muzik2 = inp.nextInt();
        while (muzik2 < 0 || muzik2 > 100) {
            System.out.print("Geçersiz Not. Tekrar Girin : ");
            muzik2 = inp.nextInt();
        }
        muzik = (muzik1 + muzik2) / 2f;

        //Genel Not Ortaaması
        float toplam = (mat + fizik + kimya + turkce  + muzik);
        float sonuc = toplam / 5.0f;

        System.out.println("Matematik Not Ortalamanız : " + mat);
        System.out.println("Fizik Not Ortalamanız : " + fizik);
        System.out.println("Kimya Not Ortalamanız : " + kimya);
        System.out.println("Türkçe Not Ortalamanız : " + turkce);
        System.out.println("Müzik Not Ortalamanız : " + muzik);
        System.out.println("---------------------------------");

        if (sonuc >= 55) {
            System.out.println("Genel Not Ortalamanız : " + sonuc);
            System.out.println("Tebrikler Sınıfı Geçtiniz. ");
        }else {
            System.out.println("Genel Not Ortalamanız : " + sonuc);
            System.out.println("Malesef Sınıfı Geçemediniz. ");
        }
    }
}