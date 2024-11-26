import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        float mat, fizik, kimya, turkce, tarih, muzik;
        int mat1, mat2, fizik1, fizik2, kimya1, kimya2, turkce1, turkce2, tarih1, tarih2, muzik1, muzik2;

        // Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.print("Matematik İlk Notunuz : ");
        mat1 = inp.nextInt();
        System.out.print("Matematik İkinci Notunuz : ");
        mat2 = inp.nextInt();
        mat = (mat1 + mat2) / 2f;


        //Fizik
        System.out.print("Fizik İlk Notunuz : ");
        fizik1 = inp.nextInt();
        System.out.print("Fizik İkinci Notunuz : ");
        fizik2 = inp.nextInt();
        fizik = (fizik1 + fizik2) / 2f;


        //Kimya
        System.out.print("Kimya İlk Notunuz : ");
        kimya1 = inp.nextInt();
        System.out.print("Kimya İkinci Notunuz : ");
        kimya2 = inp.nextInt();
        kimya = (kimya1 + kimya2) / 2f;


        //Turkce
        System.out.print("Turkce İlk Notunuz : ");
        turkce1 = inp.nextInt();
        System.out.print("Turkce İkinci Notunuz : ");
        turkce2 = inp.nextInt();
        turkce = (turkce1 + turkce2) / 2f;


        //Tarih
        System.out.print("Tarih İlk Notunuz : ");
        tarih1 = inp.nextInt();
        System.out.print("Tarih İkinci Notunuz : ");
        tarih2 = inp.nextInt();
        tarih = (tarih1 + tarih2) / 2f;


        //Muzik
        System.out.print("Muzik İlk Notunuz : ");
        muzik1 = inp.nextInt();
        System.out.print("Muzik İkinci Notunuz : ");
        muzik2 = inp.nextInt();
        muzik = (muzik1 + muzik2) / 2f;

        //Genel Not Ortaaması
        float toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        float sonuc = toplam / 6.0f;

        // Ortalamayı kontrol et
        boolean gecti = sonuc >= 60;

        System.out.println("Matematik Not Ortalamanız : " + mat);
        System.out.println("Fizik Not Ortalamanız : " + fizik);
        System.out.println("Kimya Not Ortalamanız : " + kimya);
        System.out.println("Türkçe Not Ortalamanız : " + turkce);
        System.out.println("Tarih Not Ortalamanız : " + tarih);
        System.out.println("Müzik Not Ortalamanız : " + muzik);
        System.out.println("Genel Not Ortalamanız : " + sonuc);

        System.out.println("Sonuç: " + (gecti ? "Geçti" : "Kaldı"));

    }
}