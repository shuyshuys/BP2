package Kasir;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static String[] menuCombined;
    public static String[] menuMakanan;
    public static String[] menuMinuman;
    public static String[] menuSnack;
    public static int[] hargaCombined;
    public static int[] hargaMakanan;
    public static int[] hargaMinuman;
    public static int[] hargaSnack;
    public static String[] categoryCombined;
    public static String[] categoryMakan;
    public static String[] categoryMinum;
    public static String[] categorySnack;

    public static int index;

    public static String[][] mCari(String data[], String kata, int[] harga) {
        String[][] hCari = new String[data.length][2];
        String[][] dMenu = new String[data.length][2];
        int idx = 0;
        for (int i = 0; i < data.length; i++) {
            dMenu[i][0] = data[i].toLowerCase();
            String caridaftar = kata.toLowerCase();
            if (dMenu[i][0].indexOf(caridaftar) >= 0) {
                hCari[idx][0] = data[i];
                hCari[idx][1] = String.valueOf(harga[i]);
                idx++;
            }
        }
        // while (index < data.length) {
        // kata.matches(data[index]);
        // }
        return hCari;
    }

    public static void menuCombined() {
        String[] newArrays = Arrays.copyOf(menuMakanan, menuMakanan.length + menuMinuman.length);
        System.arraycopy(menuMinuman, 0, newArrays, menuMakanan.length, menuMinuman.length);

        menuCombined = Arrays.copyOf(newArrays, newArrays.length + menuSnack.length);
        System.arraycopy(menuSnack, 0, menuCombined, newArrays.length, menuSnack.length);
        // print hasil combine
        System.out.println(Arrays.toString(menuCombined) + "  sebanyak " + menuCombined.length);
    }

    public static void hargaCombined() {
        int[] newArrays = Arrays.copyOf(hargaMakanan, hargaMakanan.length + hargaMinuman.length);
        System.arraycopy(hargaMinuman, 0, newArrays, hargaMakanan.length, hargaMinuman.length);

        hargaCombined = Arrays.copyOf(newArrays, newArrays.length + hargaSnack.length);
        System.arraycopy(hargaSnack, 0, hargaCombined, newArrays.length, hargaSnack.length);
        // print hasil combine
        System.out.println(Arrays.toString(hargaCombined) + "  sebanyak " + hargaCombined.length);
    }

    public static void categoryCombined() {
        String[] newArrays = Arrays.copyOf(categoryMakan, categoryMakan.length + categoryMinum.length);
        System.arraycopy(categoryMinum, 0, newArrays, categoryMakan.length, categoryMinum.length);

        categoryCombined = Arrays.copyOf(newArrays, newArrays.length + categorySnack.length);
        System.arraycopy(categorySnack, 0, categoryCombined, newArrays.length, categorySnack.length);
        // print hasil combine
        System.out.println(Arrays.toString(categoryCombined) + "  sebanyak " + categoryCombined.length);
    }

    public static void main(String[] args) {
        mineReader.getReader(mineAdditional.pathMakanan, "Menu Makanan");
        mineReader.getReaderInt(mineAdditional.pathHargaMakanan, "Harga Makanan");
        mineReader.getReader(mineAdditional.pathMinuman, "Menu Minuman");
        mineReader.getReaderInt(mineAdditional.pathHargaMinuman, "Harga Minuman");
        mineReader.getReader(mineAdditional.pathSnack, "Menu Snack");
        mineReader.getReaderInt(mineAdditional.pathHargaSnack, "Harga Snack");
        menuCombined();
        hargaCombined();
        categoryCombined();
        menuLogin();
    }

    public static void menuLogin() {
        int pilihMenu;
        do {
            mineAdditional.border();
            System.out.println("------- Menu login Warung Makan Sederhana -------");
            System.out.println("1. Kasir");
            System.out.println("2. Admin");
            System.out.println("3. Owner");
            System.out.println("4. Keluar");
            System.out.print("Silahkan pilih menu: ");
            pilihMenu = sc.nextInt();

            switch (pilihMenu) {
                case 1:
                    mineMenuKasir.menuKasir();
                    break;
                case 2:
                    mineMenuAdmin.menuAdmin();
                    break;
                case 3:
                    mineMenuOwner.menuOwner();
                    break;
                case 4:
                    mineAdditional.border();
                    System.out.println("Terima kasih...");
                    mineAdditional.border();
                    break;
                // case 5:
                // mineWriter.writeMenuMakanan();
                // mineWriter.writeMenuMinuman();
                // break;
                default:
                    mineAdditional.border();
                    mineAdditional.salahInput();
                    mineAdditional.border();
                    break;
            }
        } while (pilihMenu != 4);
    }

    public static String listMenu[] = new String[50];
    public static int[] listPorsi = new int[50];
    public static int[] listHarga = new int[50];
    public static String[] listCategory = new String[50];
    static int list = 0;
    static int total = 0;

    public static void putData(String menu, int harga, int porsi, int subtotal) {
        if (list >= 50) {
            System.out.println("Kapasitas penuh...");
        } else {
            listMenu[list] = menu;
            listHarga[list] = harga;
            listPorsi[list] = porsi;
            total = subtotal + total;
            System.out.println("Pencatatan berhasil");
            list++;
        }
        mineWriter.write(mineAdditional.pathStruk, listCategory, listMenu, listHarga, listPorsi);
    }

    public static void printList(String[] menu, int[] harga) {
        for (int i = 0; i < harga.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + "       \t Rp." + harga[i]);
        }
    }

    public static void printListCombined() {
        for (int i = 0; i < menuCombined.length; i++) {
            System.out.println((i + 1) + ". " + menuCombined[i] + "       \t Rp." + hargaCombined[i]);
        }
    }

    public static void printListPembelian() {
        for (int i = 0; i < list; i++) {
            System.out.println(
                    (i + 1) + ". " + listMenu[i] + "       \t Rp." + listHarga[i] + "     \t" + listPorsi[i]
                            + " porsi");
        }
        System.out.println("Total: \t\t\tRp." + total);
    }

    public static int hitungSubTotal(int porsi, int harga) {
        return porsi * harga;
    }
}
