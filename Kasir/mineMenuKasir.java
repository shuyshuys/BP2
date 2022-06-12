package Kasir;

import java.util.Scanner;

class mineMenuKasir {
    private static Scanner sc = new Scanner(System.in);
    static int pilihMenu;

    public static void menuKasir() {
        int pilihKasir;
        do {
            mineAdditional.border();
            System.out.println("--- Menu Kasir Warung Makan Sederhana ---");
            System.out.println("1. Daftar Menu Keseluruhan");
            System.out.println("2. Daftar Menu Makanan");
            System.out.println("3. Daftar Menu Minuman");
            System.out.println("4. Daftar Menu Snack");
            System.out.println("5. Mencari Menu");
            System.out.println("6. List Pembelian");
            System.out.println("7. Logout");
            System.out.print("Pilihan menu Kasir: ");
            pilihKasir = sc.nextInt();
            switch (pilihKasir) {
                case 1:
                    break;
                case 2:
                    Main.printList(Main.menuMakanan, Main.hargaMakanan);
                    do {
                        daftar("Makanan", Main.menuMakanan, Main.hargaMakanan);
                        menuKasir();
                    } while (pilihMenu < 1 || pilihMenu > Main.menuMakanan.length);

                    break;
                case 3:
                    Main.printList(Main.menuMinuman, Main.hargaMinuman);
                    do {
                        daftar("Minuman", Main.menuMinuman, Main.hargaMinuman);
                        menuKasir();
                    } while (pilihMenu < 1 || pilihMenu > Main.menuMinuman.length);
                    break;
                case 4:
                    Main.printList(Main.menuSnack, Main.hargaSnack);
                    do {
                        daftar("Snack", Main.menuSnack, Main.hargaSnack);
                        menuKasir();
                    } while (pilihMenu < 1 || pilihMenu > Main.menuSnack.length);
                    break;
                case 5:
                    System.out.print("Mencari Menu: ");
                    String kata = sc.next();
                    String[][] hCari = Main.mCari(Main.menuCombined, kata, Main.hargaCombined);
                    for (int i = 0; i < hCari.length; i++) {
                        if (hCari[i][0] != null && hCari[i][1] != null)
                            System.out.println((i + 1) + ". " + hCari[i][0] + "\t\t" + Integer.parseInt(hCari[i][1]));
                    }
                    System.out.print(" Pilih menu :  ");
                    // int pilih3 = sc.nextInt();
                    // daftar(category, hCari, hCari);
                    break;
                case 6:
                    Main.printListPembelian();
                    break;
                case 7:
                    Main.menuLogin();
                    break;
                default:
                    mineAdditional.salahInput();
                    break;
            }
        } while (pilihKasir < 1 || pilihKasir > 3);
        sc.close();
    }

    static void daftar(String jenis, String[] menu, int[] harga) {
        System.out.println(menu.length + 1 + ". Keluar");
        System.out.print("Pesan menu " + jenis + " nomor: ");
        pilihMenu = sc.nextInt();
        if (pilihMenu > 0 && pilihMenu <= menu.length) {
            System.out.print(menu[pilihMenu - 1] + " berapa porsi: ");
            int listPorsi = sc.nextInt();
            String listMenu = menu[pilihMenu - 1];
            int listHarga = harga[pilihMenu - 1];
            int subtotal = Main.hitungSubTotal(listPorsi, listHarga);
            Main.putData(listMenu, listHarga, listPorsi, subtotal);
        } else {
            menuKasir();
        }
    }
}
