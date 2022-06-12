package BP2.pkgPalindrom;

import BP2.add;
import java.util.Scanner;

public class appPalindrom {
    private static Scanner sc = new Scanner(System.in);
    private static int pilih = 0;

    public static void main(String[] args) {
        do {
            add.cls();
            add.border();
            System.out.println("MENU PENGECEKAN PALINDROM");
            add.border();
            System.out.println("1. Cek Palindrom");
            System.out.println("2. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    cekPalindrom();
                    break;
                case 2:
                    add.border();
                    System.out.println("Terima Kasih Telah Menggunakan Program ini!");
                    add.border();
                    System.exit(0);
                default:
                    add.border();
                    System.out.println("Pilihan tidak ada");
                    add.border();
            }
        } while (pilih != 2);
        sc.close();
    }

    private static void cekPalindrom() {
        add.cls();
        cStack stack = new cStack();
        cStack reverseStack = new cStack();

        int jumlahKata = 0;
        Boolean palindrom = false;

        add.border();
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

        add.border();
        System.out.println("Kata [" + kata + "], palindrom = " + palindrom);
        add.border();
        System.out.println("1. Coba lagi");
        System.out.println("2. Keluar");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                cekPalindrom();
                break;
            case 2:
                add.border();
                System.out.println("Terima Kasih Telah Menggunakan Program ini!");
                add.border();
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }
}
