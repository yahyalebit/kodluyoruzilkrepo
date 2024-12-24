import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, sort;
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Büyükten Küçüğe ");
        System.out.println("2 - Küçükten Büyüğe ");
        System.out.println("Sıralamak istediğiniz numarayı seçin : ");
        sort = input.nextInt();

        while (sort > 2 || sort < 1) {
            System.out.print("Hatalı Seçim. Lütfen Tekrar Deneyin... : ");
            sort = input.nextInt();
        }
        System.out.print("1. Sayı : ");
        a = input.nextInt();

        System.out.print("2. Sayı : ");
        b = input.nextInt();

        System.out.print("3. Sayı : ");
        c = input.nextInt();

        switch (sort) {
            case 1:
                if ((a > b) && (a > c)) {
                    if (b > c) {
                        System.out.println("a > b > c");
                    } else {
                        System.out.println("a > c > b");
                    }
                } else if ((b > a) && (b > c)) {
                    if (a > c) {
                        System.out.println("b > a > c");
                    } else {
                        System.out.println("b > c > a");
                    }
                } else if ((c > a) && (c > b)) {
                    if (a > b) {
                        System.out.println("c > a > b");
                    } else {
                        System.out.println("c > b > a");
                    }
                }
                break;
            case 2:
                if ((a < b) && (a < c)) {
                    if (b < c) {
                        System.out.println("a < b < c");
                    } else {
                        System.out.println("a < c < b");
                    }
                } else if ((b < a) && (b < c)) {
                    if (a < c) {
                        System.out.println("b < a < c");
                    } else {
                        System.out.println("b < c < a");
                    }
                } else if ((c < a) && (c < b)) {
                    if (a < b) {
                        System.out.println("c < a < b");
                    } else {
                        System.out.println("c < b < a");
                    }
                }
                break;
            default:
                /////////////////
                break;
        }
    }
}