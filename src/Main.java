import java.util.Scanner;

public class Main {

    static void plus(Scanner scan) {
        System.out.print("1. Sayı : ");
        int num1 = scan.nextInt();
        System.out.print("2. Sayı : ");
        int num2 = scan.nextInt();
        int reuslt = num1 + num2;
        System.out.println("Sonuç : " + reuslt);
    }

    static void minus(Scanner scan) {
        System.out.print("1. Sayı : ");
        int num1 = scan.nextInt();
        System.out.print("2. Sayı : ");
        int num2 = scan.nextInt();
        int result = num1 - num2;
        System.out.println("Sonuç : " + result);
    }

    static void times(Scanner scan) {
        System.out.print("1. Sayı : ");
        int num1 = scan.nextInt();
        System.out.print("2. Sayı : ");
        int num2 = scan.nextInt();
        int result = num1 * num2;
        System.out.println("Sonuç : " + result);
    }

    static void divided(Scanner scan) {
        System.out.print("1. Sayı : ");
        int num1 = scan.nextInt();
        System.out.print("2. Sayı : ");
        int num2 = scan.nextInt();

        if (num2 != 0) {
            int result = num1 / num2;
            System.out.println("Sonuç : " + result);
        } else {
            System.out.println("Bir sayı 0'a bölünemez!");
        }
    }

    static void power(Scanner scan) {
        System.out.print("Tabanı giriniz : ");
        int base = scan.nextInt();
        System.out.print("Üssü giriniz : ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }

    static void factorial(Scanner scan) {
        System.out.print("Bir sayı giriniz : ");
        int number = scan.nextInt();

        if (number >= 0) {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= 1;
            }
            System.out.println("Sonuç : " + factorial);
        } else {
            System.out.println("Negatif sayıların faktoriyeli hesaplanamaz!");
        }
    }

    static void mod(Scanner scan) {
        System.out.print("Birinci sayıyı giriniz : ");
        int num1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int num2 = scan.nextInt();
        int result = num1 % num2;
        System.out.println("Sonuç : " + result);
    }

    static void calc(Scanner scan) {
        System.out.print("Dikdörtgenin uzun kenarını giriniz : ");
        double longEdge = scan.nextDouble();
        System.out.print("Dikdörtgenin kısa kenarını giriniz : ");
        double shortEdge = scan.nextDouble();

        double area = longEdge * shortEdge;
        double environment = 2 * (longEdge + shortEdge);

        System.out.println("Alan : " + area);
        System.out.println("Çevre : " + environment);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz : ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus(scan);
                    break;
                case 2:
                    minus(scan);
                    break;
                case 3:
                    times(scan);
                    break;
                case 4:
                    divided(scan);
                    break;
                case 5:
                    power(scan);
                    break;
                case 6:
                    factorial(scan);
                    break;
                case 7:
                    mod(scan);
                    break;
                case 8:
                    calc(scan);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }while (select != 0);
    }
}