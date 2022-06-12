package Kasir;

import java.util.Scanner;

class mineMenuOwner {
    public static void menuOwner() {
        Scanner sc = new Scanner(System.in);
        int pilihMember;
        do {
            System.out.println();
            System.out.println("--- Menu Owner Warung Makan Sederhana ---");
            System.out.println("1. Laporan Pemasukan");
            System.out.println("2. 5 Makanan terlaris");
            System.out.println("3. Urutkan berdasarkan");
            System.out.println("4. Logout");
            System.out.print("Silahkan pilih opsi: ");
            pilihMember = sc.nextInt();
            switch (pilihMember) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    Main.menuLogin();
                    break;
                default:
                    mineAdditional.salahInput();
                    break;
            }
        } while (pilihMember < 1 || pilihMember > 3);
        sc.close();
    }
}
