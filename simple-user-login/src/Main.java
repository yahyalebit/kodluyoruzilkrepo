import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişken atamaları
        String userName, password, reset, newPassword;

        // Scanner sınıfı ekleme
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan veri alma
        System.out.print("Kullanıcı Adınızı Girin : ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi Girin : ");
        password = inp.nextLine();

        // Giriş kontrolü
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yapıldı.");
        } else {
            System.out.println("Hatalı Kullanıcı Adı veya Şifre!");

            // Şifre sıfırlama işlemi
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            reset = inp.nextLine();

            if (reset.equals("evet")) {
                while (true) {
                    System.out.print("Yeni Şifrenizi Girin: ");
                    newPassword = inp.nextLine();

                    // Yeni şifre kontrolü
                    if (newPassword.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Yeni Şifre oluşturuldu.");
                        break;
                    }
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}