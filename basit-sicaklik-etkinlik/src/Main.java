import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı Girin : ");
        heat = input.nextInt();

        switch ((heat < 5) ? 1 : (heat <= 15) ? 2 : (heat <= 25) ? 3 : 4) {
            case 1:
                System.out.println("Kayak Yapabilirsiniz.");
                break;
            case 2:
                System.out.println("Sinemaya Gidebilirsiniz.");
                System.out.println("Pikniğe Gidebilirsiniz.");
                break;
            case 3:
                System.out.println("Pikniğe Gidebilirsiniz.");
                break;
            case 4:
                System.out.println("Yüzmeye Gidebilirsiniz.");
                break;
            default:
                System.out.println("Geçersiz sıcaklık değeri.");
        }
    }
}
