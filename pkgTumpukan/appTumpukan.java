package pkgTumpukan;

import java.util.Scanner;

public class appTumpukan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cTumpukan stack = new cTumpukan();
        int pilih = 0;
        do {
            System.out.println("\nMENU STACK");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama : ");
                    String nama = sc.next();
                    cElemen baru = new cElemen(nama);
                    stack.push(baru);
                    break;
                case 2:
                    cElemen t = stack.pop();
                    if (t == null) {
                        System.out.println("Tumpukan kosong");
                    }
                    if (t != null) {
                        System.out.println("Nama yang di pop : " + t.getNama());
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        } while (pilih != 4);
        sc.close();
    }
}
