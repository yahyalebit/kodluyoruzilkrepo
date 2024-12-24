import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month,day;

        Scanner input = new Scanner(System.in);

        System.out.println("1- Ocak\n2- Şubat\n3- Mart\n4- Nisan\n5- Mayıs\n6- Haziran\n7- Temmuz\n8- Ağustos\n9- Eylül\n10- Ekim\n11- Kasım\n12- Aralık");
        System.out.print("Doğduğunuz Ayı Girin (sayı) : ");
        month = input.nextInt();

        while (month > 12 || month < 1) {
            System.out.print("Hatalı Seçim. Lütfen Tekrar Deneyin... : ");
            month = input.nextInt();
        }

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
            System.out.print("Doğduğunuz Günü Girin : ");
            day = input.nextInt();
            while (day > 31 || day < 1) {
                System.out.print("Hatalı Seçim. Lütfen Tekrar Deneyin... : ");
                day = input.nextInt();
            }
        }else if(month == 4 || month == 6 || month == 9 || month == 11 ){
            System.out.print("Doğduğunuz Günü Girin : ");
            day = input.nextInt();
            while (day > 30 || day < 1) {
                System.out.print("Hatalı Seçim. Lütfen Tekrar Deneyin... : ");
                day = input.nextInt();
            }
        }else{
            System.out.print("Doğduğunuz Günü Girin : ");
            day = input.nextInt();
            while (day > 29 || day < 1) {
                System.out.print("Hatalı Seçim. Lütfen Tekrar Deneyin... : ");
                day = input.nextInt();
            }
        }



        if (month == 1){
            if (day >= 22 ){
                System.out.println("Kova");
            }else{
                System.out.println("Oğlak");
            }
        }else if (month == 2){
            if (day >= 20){
                System.out.println("Balık");
            }else{
                System.out.println("Kova");
            }
        }else if (month == 3){
            if (day >= 21){
                System.out.println("Koç");
            }else{
                System.out.println("Balık");
            }
        }else if (month == 4){
            if (day >= 21){
                System.out.println("Boğa");
            }else{
                System.out.println("Koç");
            }
        }else if (month == 5){
            if (day >= 22){
                System.out.println("İkizler");
            }else{
                System.out.println("Boğa");
            }
        }else if (month == 6){
            if (day >= 23){
                System.out.println("Yengeç");
            }else{
                System.out.println("İkizler");
            }
        }else if (month == 7){
            if (day >= 23){
                System.out.println("Aslan");
            }else{
                System.out.println("Yengeç");
            }
        }else if (month == 8){
            if (day >= 23){
                System.out.println("Başak");
            }else{
                System.out.println("Aslan");
            }
        }else if (month == 9){
            if (day >= 23){
                System.out.println("Terazi");
            }else{
                System.out.println("Başak");
            }
        }else if (month == 10){
            if (day >= 23){
                System.out.println("Akrep");
            }else{
                System.out.println("Terazi");
            }
        }else if (month == 11){
            if (day >= 22){
                System.out.println("Yay");
            }else{
                System.out.println("Akrep");
            }
        }else {
            if (day >= 22){
                System.out.println("Oğlak");
            }else{
                System.out.println("Yay");
            }
        }
    }
}