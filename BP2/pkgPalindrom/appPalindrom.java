package BP2.pkgPalindrom;

import java.util.Scanner;

public class appPalindrom {
    private static Scanner sc = new Scanner(System.in);
    private static int pilih = 0;

    public static void main(String[] args) {
        do {
            cls();
            border();
            System.out.println("MENU PENGECEKAN PALINDROM");
            border();
            System.out.println("1. Cek Palindrom");
            System.out.println("2. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    cekPalindrom();
                    break;
                case 2:
                    border();
                    System.out.println("Terima Kasih Telah Menggunakan Program ini!");
                    border();
                    System.exit(0);
                default:
                    border();
                    System.out.println("Pilihan tidak ada");
                    border();
            }
        } while (pilih != 2);
        sc.close();
    }

    private static void cekPalindrom() {
        cls();
        cStack stack = new cStack();
        cStack reverseStack = new cStack();

        int jumlahKata = 0;
        Boolean palindrom = false;

        border();
        System.out.print("Masukkan Kata : ");
        String kata = sc.next();
        jumlahKata = kata.length();

        for (int i = 0; i < jumlahKata; i++) {
            stack.push(new cItem(kata.split("")[i]));
        }

        for (int i = jumlahKata - 1; i >= 0; i--) {
            reverseStack.push(new cItem(kata.split("")[i]));
        }

        for (int i = 0; i < jumlahKata; i++) {
            String popKata = stack.pop();
            String popReverseKata = reverseStack.pop();
            if (popKata.equalsIgnoreCase(popReverseKata)) {
                palindrom = true;
            } else {
                palindrom = false;
                break;
            }
        }

        border();
        System.out.println("Kata [" + kata + "], palindrom = " + palindrom);
        border();
        System.out.println("1. Coba lagi");
        System.out.println("2. Keluar");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                cekPalindrom();
                break;
            case 2:
                border();
                System.out.println("Terima Kasih Telah Menggunakan Program ini!");
                border();
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }

    public static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void border() {
        System.out.println("---------------------------------");

    }
}
