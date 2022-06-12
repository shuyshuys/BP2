package BP2.pkgWarung3;

import java.util.Scanner;

public class appWarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cPemilik owner = new cPemilik("Budi", "Jl. Kebon Jeruk");
        cPembeli pb1 = new cPembeli("Susi", "Rungkut");
        cWarung warung = new cWarung("Warung A", "Jl. Kebon Anggur");
        cMakanan mkn1 = new cMakanan("Sate", 15000);
        cMinuman mn1 = new cMinuman("Es Teh", 5000);

        int pilih1 = 0, pilih2;
        do {
            System.out.println("\nMENU UTAMA");
            System.out.println("1. Pemilik");
            System.out.println("2. Warung");
            System.out.println("3. Buat Warung");
            System.out.println("4. Pembeli");
            System.out.println("5. Makanan");
            System.out.println("6. Minuman");
            System.out.println("7. Pembelian");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            pilih1 = sc.nextInt();
            switch (pilih1) {
                case 1:
                    do {
                        System.out.println("  \nMENU PEMILIK");
                        System.out.println("  1. Data Pemilik");
                        System.out.println("  2. Ubah data");
                        System.out.println("  3. Lihat data");
                        System.out.println("  4. Buat Warung");
                        System.out.println("  5. Kembali");
                        System.out.print("  Pilih menu: ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.print("  Nama pemilik: ");
                                String n = sc.next();
                                System.out.print("  Alamat pemilik: ");
                                String a = sc.next();
                                owner = new cPemilik(n, a);
                                break;
                            case 2:
                                System.out.print("  Alamat baru pemilik: ");
                                String al = sc.next();
                                owner.setAlamat(al);
                                break;
                            case 3:
                                String t = owner.ToString();
                                System.out.println("  \nPemilik: " + t);
                                break;
                            case 4:
                                owner.buatWarung(warung);
                                System.out.println("  Warung telah dibuat");
                                break;
                            case 5:
                                System.out.println("Kembali ke menu utama...");
                                break;
                            default:
                                System.out.println("Pilihan tidak ada");
                        }
                    } while (pilih2 != 5);
                    break;
                case 2:
                    do {
                        System.out.println("  \nMENU WARUNG");
                        System.out.println("  1. Tambah Warung");
                        System.out.println("  2. Ubah data");
                        System.out.println("  3. Lihat data");
                        System.out.println("  4. Kembali");
                        System.out.print("  Pilih menu: ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.print("  Nama warung: ");
                                String n = sc.next();
                                System.out.print("  Alamat warung: ");
                                String a = sc.next();
                                warung = new cWarung(n, a);
                                break;
                            case 2:
                                System.out.print("  Alamat baru warung: ");
                                String al = sc.next();
                                warung.setAlamat(al);
                                break;
                            case 3:
                                String t = warung.ToString();
                                System.out.println("  \nWarung: " + t);
                                break;
                            case 4:
                                System.out.println("Kembali ke menu utama...");
                                break;
                            default:
                                System.out.println("Pilihan tidak ada");
                        }
                    } while (pilih2 != 4);
                    break;
                case 3:
                    do {
                        // submenu pembuatan warung
                        System.out.println("  \nMENU BUAT WARUNG");
                        System.out.println("  1. Tambah warung");
                        System.out.println("  2. Lihat warung");
                        System.out.println("  3. Hapus warung");
                        System.out.println("  4. Kembali");
                        System.out.print("  Pilih menu: ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                owner.buatWarung(warung);
                                break;
                            case 2:
                                owner.lihatWarung();
                                break;
                            case 3:
                                owner.hapusWarung();
                                break;
                            case 4:
                                System.out.println("Kembali ke menu utama...");
                                break;
                            default:
                                break;
                        }
                    } while (pilih2 != 4);
                    break;
                case 4:
                    do {
                        System.out.println("  \nMENU PEMBELI");
                        System.out.println("  1. Data Baru");
                        System.out.println("  2. Lihat data");
                        System.out.println("  3. Ubah data");
                        System.out.println("  4. Selesai");
                        System.out.print("  Pilih menu: ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.println("  Nama pembeli: ");
                                String n = sc.next();
                                System.out.println("  Alamat pembeli: ");
                                String a = sc.next();
                                pb1 = new cPembeli(n, a);
                                break;
                            case 2:
                                String t = pb1.ToString();
                                System.out.println("  \nPembeli: " + t);
                                break;
                            case 3:
                                System.out.print("  Alamat baru pembeli: ");
                                String ab = sc.next();
                                pb1.setAlamat(ab);
                                break;
                            case 4:
                                System.out.println("Kembali ke menu utama...");
                                break;
                        }
                    } while (pilih2 != 4);
                    break;
                case 5:
                    do {
                        System.out.println("  \nMENU MAKANAN");
                        System.out.println("  1. Tambah makanan");
                        System.out.println("  2. Lihat makanan");
                        System.out.println("  3. Hapus makanan");
                        System.out.println("  4. Kembali");
                        System.out.print("  Pilih menu: ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.println("  Nama makanan: ");
                                String n = sc.next();
                                System.out.println("  Harga makanan: ");
                                int h = sc.nextInt();
                                mkn1 = new cMakanan(n, h);
                                break;
                            case 2:
                                String t = mkn1.ToString();
                                System.out.println("  \nMakanan: " + t);
                                break;
                            case 3:
                                System.out.println("  Hapus makanan");
                                break;
                            case 4:
                                System.out.println("Kembali ke menu utama...");
                                break;
                            default:
                                break;
                        }
                    } while (pilih2 != 4);
                    break;
                case 6:
                    do {
                        System.out.println("  \nMENU MINUMAN");
                        System.out.println("  1. Tambah minuman");
                        System.out.println("  2. Lihat minuman");
                        System.out.println("  3. Hapus minuman");
                        System.out.println("  4. Kembali");
                        System.out.print("  Pilih menu: ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.println("  Nama minuman: ");
                                String n = sc.next();
                                System.out.println("  Harga minuman: ");
                                int h = sc.nextInt();
                                mn1 = new cMinuman(n, h);
                                break;
                            case 2:
                                String t = mn1.ToString();
                                System.out.println("  \nMinuman: " + t);
                                break;
                            case 3:
                                System.out.println("  Hapus minuman");
                                break;
                            case 4:
                                System.out.println("Kembali ke menu utama...");
                                break;
                            default:
                                break;
                        }
                    } while (pilih2 != 4);
                    break;
                case 7:
                    do {
                        System.out.println("  \nMENU PESANAN");
                        System.out.println("  1. Buat Transaksi");
                        System.out.println("  2. Lihat Transaksi");
                        System.out.println("  3. Ubah Transaksi");
                        System.out.println("  4. Hapus Transaksi");
                        System.out.println("  5. Kembali");
                        System.out.print("  Pilih menu: ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                pb1.beliMakanan(mkn1);
                                break;
                            case 2:
                                pb1.lihatMakanan();
                                break;
                            case 3:
                                cMakanan mkn2 = new cMakanan("Soto", 10000);
                                pb1.ubahMakanan(mkn2);
                                break;
                            case 4:
                                pb1.hapusMakanan();
                                break;
                            case 5:
                                System.out.println("  Kembali ke menu utama...");
                                break;
                        }
                    } while (pilih2 != 5);
                    break;
                case 8:
                    System.out.println("  \nKeluar dari program");
                    break;
                default:
                    System.out.println("\nPilihan tidak tersedia");
                    break;
            }
        } while (pilih1 != 8);
        sc.close();
    }
}
