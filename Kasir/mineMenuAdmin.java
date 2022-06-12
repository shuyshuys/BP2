package Kasir;

import java.util.Scanner;

class mineMenuAdmin {
    public static void menuAdmin() {
        Scanner sc = new Scanner(System.in);
        int pilihAdmin;
        do {
            System.out.println();
            System.out.println("--- Menu Admin Warung Makan Sederhana ---");
            System.out.println("1. Daftar Menu Keseluruhan");
            System.out.println("2. Daftar Menu Makanan");
            System.out.println("3. Daftar Menu Minuman");
            System.out.println("4. Daftar Menu Snack");
            System.out.println("5. Menambah Menu");
            System.out.println("6. Mengubah Menu (melalui pencarian)");
            System.out.println("7. Menghapus Menu 123");
            System.out.println("3. Logout");
            System.out.print("Silahkan pilih opsi: ");
            pilihAdmin = sc.nextInt();
            switch (pilihAdmin) {
                case 1:
                    Main.printListCombined();
                    menuAdmin();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    Main.menuLogin();
                    break;
                default:
                    mineAdditional.salahInput();
                    break;
            }
        } while (pilihAdmin < 1 || pilihAdmin > 3);
        sc.close();
    }
}
