import java.util.Scanner;

public class AppLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cBarang b1 = new cBarang("tas", 500000);
        cBarang b2 = new cBarang("sepatu", 155000);
        // cSimpul
        cLinkedList ll = new cLinkedList();

        int pilih = 0;
        do {
            System.out.println("Aplikasi Linked List");
            System.out.println("1. Tambah Depan");
            System.out.println("2. Hapuss depan");
            System.out.println("3. Lihat linkedlist");
            System.out.println("4. Exit");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    int pilih2 = sc.nextInt();
                    if (pilih2 == 1) {
                        cSimpul b = new cSimpul(b1);
                        ll.tambahDepan(b);
                    } else if (pilih2 == 2) {
                        cSimpul b = new cSimpul(b2);
                        ll.tambahDepan(b);
                    }
                    break;
                case 2:
                    ll.hapusDepan();
                    break;
                case 3:
                    ll.lihatLinkedList();
                    break;
            }
        } while (pilih != 4);
    }
}
