import BP2.add;
import BP2.pkgLinkedList.*;
import BP2.pkgPalindrom.*;
import BP2.pkgTumpukan.*;

public class Main {
    public static void main(String[] args) {
        add.cls();
        add.border();
        System.out.println("Menu Utama");
        add.border();
        System.out.println("1. Linked List");
        System.out.println("2. Palindrom");
        System.out.println("3. Tumpukan");
        System.out.println("4. Exit");
        System.out.print("Pilih: ");
        int pilih = add.sc().nextInt();
        switch (pilih) {
            case 1:
                AppLinkedList.main(args);
                break;
            case 2:
                appPalindrom.main(args);
                break;
            case 3:
                appTumpukan.main(args);
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }
}
