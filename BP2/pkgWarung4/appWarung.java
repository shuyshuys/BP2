/*
proses bisnis: Budi membeli sate dan bakso.
pendekatan nota/kwitansi.
class: pembeli, makanan, pembelian(nota/kwitansi)
*/

/*
relasi baru: Budi Membeli sate dan jus
class baru --> minuman
karena clashh makanan dan class minuman mirip/sama datanya maka akan dibuat class induk
*/

package BP2.pkgWarung4;

import java.util.Scanner;

public class appWarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilih = 0;
        cPembeli pbl = new cPembeli();
        cMakanan makanan[] = new cMakanan[5];
        makanan[0] = new cMakanan("Sate", 10000);
        makanan[1] = new cMakanan("Bakso", 15000);
        makanan[2] = new cMakanan("Soto", 20000);
        makanan[3] = new cMakanan("Bubur", 25000);
        makanan[4] = new cMakanan("Sop", 30000);

        cMinuman minuman[] = new cMinuman[5];
        minuman[0] = new cMinuman("Jus", 5000);
        minuman[1] = new cMinuman("Es Teh", 5000);
        minuman[2] = new cMinuman("Es Jeruk", 5000);
        minuman[3] = new cMinuman("Es Teh Manis", 5000);
        minuman[4] = new cMinuman("Es Jeruk Manis", 5000);

        do {
            System.out.println("------- APLIKASI WARUNG -------");
            System.out.println("1. Pembeli");
            System.out.println("2. Makanan");
            System.out.println("3. Minuman");
            System.out.println("4. Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama = ");
                    String nm = sc.nextLine();
                    pbl.setNama(nm);
                    // pembeli = new cPembeli(nm);
                    break;
                case 2:
                    System.out.println("------- DAFTAR MENU MAKANAN -------");
                    for (int i = 0; i < makanan.length; i++) {
                        System.out.println(i + 1 + ". " + makanan[i].ToString());
                        System.out.println("====================");
                    }
                    break;
                case 3:
                    System.out.println("------- DAFTAR MENU MINUMAN -------");
                    for (int i = 0; i < minuman.length; i++) {
                        System.out.println(i + 1 + ". " + minuman[i].ToString());
                        System.out.println("====================");
                    }
                    break;
                case 4:
                    System.out.println("------- NOTA PEMBELIAN -------");
                    pembelian beli = new pembelian();
                    beli.isiPembeli(pbl);
                    int pilih2 = 0;
                    do {
                        System.out.println("  1. Tambah Makanan");
                        System.out.println("  2. Hapus Makanan");
                        System.out.println("  3. Lihat Makanan");
                        System.out.print("  Pilih menu :");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.print("  Menu :");
                                // Scanner cs = new Scanner(System.in);
                                String mn = sc.next();
                                boolean ada = false;
                                for (int i = 0; i < makanan.length;) {
                                    if (mn.equalsIgnoreCase(makanan[i].getNama()))
                                        ;
                                    ada = true;
                                    beli.tambahMakanan(makanan[i]);
                                    break;
                                }
                                if (ada == false) {
                                    System.out.println("Menu tidak ditemukan!");
                                }
                                break;
                            case 2:
                                beli.hapusMakanan();
                                break;
                            case 3:
                                beli.lihatPembelian();
                                break;
                            case 4:
                                System.out.println("Keluar...");
                                break;
                            default:
                                System.out.println("Menu tidak ditemukan!");
                                break;
                        }

                    } while (pilih2 != 4);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
                    break;
            }
        } while (pilih != 4);
        sc.close();
    }
}
