package pkgPalindrom;

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
                    System.out.println("Terima kasih");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada");
            }
        } while (pilih != 2);
        sc.close();
    }

    private static void cekPalindrom() {
        cStack stack = new cStack();
        int jumlahKata;
        Boolean palindrom = false;
        border();
        System.out.print("Masukkan kata : ");
        String kata = sc.next();
        jumlahKata = kata.length();
        String[] splitKata = kata.split("");
        for (String huruf : splitKata) {
            cItem baru = new cItem(huruf);
            stack.push(baru);
        }
        for (int i = 0; i < jumlahKata; i++) {
            String hasilPop = stack.pop();
            if (splitKata[i].equalsIgnoreCase(hasilPop)) {
                System.out.println("Huruf [" + splitKata[i] + "] sama dengan hasil pop [" + hasilPop + "]");
                palindrom = true;
            } else {
                System.out.println("Huruf [" + splitKata[i] + "] tidak sama dengan hasil pop [" + hasilPop + "]");
                palindrom = false;
                break;
            }
        }
        border();
        System.out.println("Palindrom = " + palindrom);
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
                System.out.println("Terima Kasih Telah Menggunakan Program ini!");
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
