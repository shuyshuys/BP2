package BP2.pkgWarung2;

import java.util.Scanner;

class cPembeli {
    // data
    private String nama;
    private String alamat;

    // menthod
    cPembeli(String n, String a) {
        nama = n;
        alamat = a;
        System.out.println("Pembeli " + nama + " berhasil ditambahkan");
    }

    public void setNama(String n) {
        nama = n;
    }

    public void setAlamat(String a) {
        alamat = a;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String ToString() {
        return "Nama: " + nama + "\nAlamat: " + alamat;
    }
}

class cMakanan {
    // data
    private String namaMakanan;
    private int hargaMakanan;

    // menthod
    cMakanan(String n, int h) {
        namaMakanan = n;
        hargaMakanan = h;
        System.out.println("Makanan " + namaMakanan + " berhasil ditambahkan");
    }

    public void setNamaMakanan(String n) {
        namaMakanan = n;
    }

    public void setHargaMakanan(int h) {
        hargaMakanan = h;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public int getHarga() {
        return hargaMakanan;
    }

    public String ToString() {
        return "Nama: " + namaMakanan + "\nHarga: " + hargaMakanan;
    }
}

public class appWarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cMakanan mkn = new cMakanan("Ayam Goreng", 10000);
        cPembeli pbl = new cPembeli("Budi", "Jl. Kebon Jeruk");
        int pilih = 0, pilih2;
        do {
            System.out.println("\nWARUNG SEDERHANA");
            System.out.println("1. Makanan");
            System.out.println("2. Pembeli");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    // submenu
                    pilih2 = 0;
                    do {
                        System.out.println("  Makanan");
                        System.out.println("  1. Buat Data");
                        System.out.println("  2. Tampilkan Data");
                        System.out.println("  3. Ubah Data");
                        System.out.println("  4. Hapus Data");
                        System.out.println("  5. Kembali");
                        System.out.print("  Pilih menu: ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.println("  Buat Data");
                                System.out.print("  1. Nama Makanan =");
                                String n = sc.next();
                                System.out.print("  2. Harga Makanan =");
                                int h = sc.nextInt();
                                mkn = new cMakanan(n, h);
                                break;
                            case 2:
                                System.out.println("  Tampilkan Data");
                                System.out.println(mkn.ToString());
                                break;
                            case 3:
                                System.out.println("  Ubah Data");
                                System.out.println("  Nama Makanan =");
                                String nb = sc.next();
                                mkn.setNamaMakanan(nb);
                                System.out.println("  Harga Baru = ");
                                int hb = sc.nextInt();
                                mkn.setHargaMakanan(hb);
                                break;
                            case 4:

                                break;
                            case 5:
                                System.out.println("ke Menu Utama...");
                                break;
                            default:
                                break;
                        }
                    } while (pilih2 != 5);
                    break;
                case 2:
                    // submenu pembeli
                    pilih2 = 0;
                    do {
                        System.out.println("  Pembeli");
                        System.out.println("  1. Buat Data");
                        System.out.println("  2. Tampilkan Data");
                        System.out.println("  3. Ubah Data");
                        System.out.println("  4. Hapus Data");
                        System.out.println("  5. Kembali");
                        System.out.print("  Pilih menu: ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.println("  Buat Data");
                                System.out.print("  1. Nama Pembeli =");
                                String n = sc.next();
                                System.out.print("  2. Alamat Pembeli =");
                                String a = sc.next();
                                pbl = new cPembeli(n, a);
                                break;
                            case 2:
                                System.out.println("  Tampilkan Data");
                                System.out.println(pbl.ToString());
                                break;
                            case 3:
                                System.out.println("  Ubah Data");
                                System.out.println("  Alamat Pembeli =");
                                String ab = sc.next();
                                pbl.setAlamat(ab);
                                break;
                            case 4:

                                break;
                            case 5:
                                System.out.println("ke Menu Utama...");
                                break;
                            default:
                                break;
                        }
                    } while (pilih2 != 5);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini");
                    break;
            }
        } while (pilih != 3);
        sc.close();
    }
}
