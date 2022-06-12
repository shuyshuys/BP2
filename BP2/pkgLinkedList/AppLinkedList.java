package BP2.pkgLinkedList;

import BP2.add;
import java.util.Scanner;

public class AppLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cBarang b1 = new cBarang("tas", 500000);
        cBarang b2 = new cBarang("sepatu", 155000);
        cBarang b3 = new cBarang("sandal", 800000);
        // cSimpul
        cLinkedList ll = new cLinkedList();

        int pilih = 0;
        do {
            add.cls();
            add.border();
            System.out.println("Aplikasi Linked List");
            add.border();
            System.out.println("1. Tambah Depan");
            System.out.println("2. Hapuss depan");
            System.out.println("3. Lihat linkedlist");
            System.out.println("4. Exit");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Tambah Depan");
                    System.out.print("1. Tambah tas\n2. Tambah sepatu\n3. Tambah sandal\nPilih: ");
                    int pilih2 = sc.nextInt();
                    if (pilih2 == 1) {
                        cSimpul b = new cSimpul(b1);
                        ll.tambahDepan(b);
                    } else if (pilih2 == 2) {
                        cSimpul b = new cSimpul(b2);
                        ll.tambahDepan(b);
                    } else if (pilih2 == 3) {
                        cSimpul b = new cSimpul(b3);
                        ll.tambahDepan(b);
                    }
                    break;
                case 2:
                    ll.hapusDepan();
                    break;
                case 3:
                    ll.lihatLinkedList();
                    break;
                case 4:
                    System.out.println("Exit");
            }
        } while (pilih != 4);
        sc.close();
    }
}
