package BP2.Module20;

import java.util.Scanner;

public class appSIAMIK3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cDosenTetap dosen[] = new cDosenTetap[5];
        int jdsn = 0, maxjdsn = 5;
        // cTendik tendik[] = new cTendik[5];
        // int jtdk = 0, maxjtdk = 5;

        do {
            System.out.println("\nMENU SIAMIK 3.0");
            System.out.println("1. Mahasiswa");
            System.out.println("2. Mata Kuliah");
            System.out.println("3. Kartu Rencana Studi");
            System.out.println("4. Program Studi");
            System.out.println("5. Pegawai");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.println("MENU MAHASISWA");
                    System.out.println("1. Tambah Mahasiswa");
                    System.out.println("2. Hapus Mahasiswa");
                    System.out.println("3. Tampilkan Mahasiswa");
                    System.out.println("4. Kembali");
                    System.out.print("Pilih menu: ");
                    int pilih1 = sc.nextInt();
                    System.out.println();
                    switch (pilih1) {
                        case 1:

                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            break;
                    }
                    while (pilih1 != 4)
                        ;
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("SUB Menu Pegawai");
                    System.out.println("1. Tambah Dosen");
                    System.out.println("2. Update Dosen");
                    System.out.println("3. Hapus Dosen");
                    System.out.println("4. Tambah Tendik");
                    System.out.println("5. Update Tendik");
                    System.out.println("6. Hapus Tendik");
                    System.out.println("7. Lihat Pegawai");
                    System.out.print("Pilih menu =");
                    int pilih2 = sc.nextInt();
                    switch (pilih2) {
                        case 1:
                            System.out.println("=== Tambah Dosen ===");
                            // jumlah dosen masih dibawah kapasitas maximal
                            if (jdsn < maxjdsn) {
                                String id, jabatan, nidn;
                                // cek apakah ID sudah ada di array dosen
                                boolean sudahAda = false;
                                do {
                                    System.out.print("Masukkan ID = ");
                                    id = sc.next();
                                    sudahAda = false;
                                    for (int i = 0; i < jdsn; i++) {
                                        sudahAda = true;
                                        // break;
                                    }
                                    if (sudahAda) {
                                        System.out.println("ID Sudah ada");
                                    }
                                } while (sudahAda == true);
                                // simpan di array objec dosen di MAIN
                                System.out.print("Masukkan Nama = ");
                                String nama = sc.nextLine();
                                // String nama = sc.next();
                                System.out.print("Masukkan Jabatan =");
                                jabatan = sc.nextLine();
                                System.out.print("Masukkan NIDN = ");
                                nidn = sc.nextLine();
                                dosen[jdsn] = new cDosenTetap(id, nama, jabatan, nidn);
                                jdsn++;
                            } else {
                                System.out.println("Kapasitas Penuh!");
                            }
                            break;
                        case 2:
                            System.out.println("=== UPDATE DOSEN ===");
                            // jumlah object dosen harus minimal 1
                            if (jdsn > 0) {
                                System.out.println("Masukkan ID =");
                                String id = sc.next();
                                // Cari ID di array object dosen di MAIN
                                // boolean ketemu = false;
                                for (int i = 0; i < jdsn; i++) {
                                    if (dosen[i].getID().equalsIgnoreCase(id)) {
                                        // ketemu = true;
                                        System.out.println("Data ditemukan");
                                        // update jabatan fungsional dosen
                                        System.out.println("Masukkan JabFung baru = ");
                                        String jabfung = sc.nextLine();
                                        System.out.println("Simpan? \n 1. Ya \n 2. Tidak");
                                        System.out.print("Pilih = ");
                                        pilih2 = sc.nextInt();
                                        if (pilih2 == 1) {
                                            // update elemen array object di MAIN
                                            dosen[i].setJabatan(jabfung);
                                            System.out.println("Update Sukses");

                                        } else {
                                            System.out.println("");
                                        }
                                    }
                                }
                            } else {

                            }
                            break;
                        case 3:
                            System.out.println("=== HAPUS DOSEN ===");
                            // jumlah object dosen harus minimal 1
                            if (jdsn > 0) {
                                System.out.println("Masukkan ID = ");
                                String id = sc.next();
                                // cari array object dosen di MAIN
                                boolean ketemu = false;
                                for (int i = 0; i < jdsn; i++) {
                                    if (dosen[i].getID().equalsIgnoreCase(id)) {
                                        ketemu = true;
                                        System.out.println("Data Ditemukan");
                                        System.out.println("Dihapus? \n 1. Ya \n 2. Tidak");
                                        System.out.print("Pilih = ");
                                        pilih2 = sc.nextInt();
                                        if (pilih2 == 1) {
                                            // hapus elemen array object di MAIN
                                            dosen[i] = null;
                                            // geser maju untuk mengisi elemen yang dihapus
                                            for (int j = i; j < jdsn; j++) {
                                                if (j == jdsn - 1) {
                                                    dosen[j] = null;
                                                } else
                                                    dosen[j] = dosen[j + 1];
                                            }
                                            jdsn--;
                                            System.out.println("Penghapusan Berhasil");
                                        } else {
                                            System.out.println("Penghapusan Batal!");
                                            break;
                                        }
                                        if (!ketemu) {
                                            System.out.println("ID Tidak ada!");
                                        }
                                    } else {
                                        System.out.println("Data dosen kosong!");
                                    }
                                    // break;

                                }
                            }
                            break;
                        default:
                            System.out.println("Menu tidak ada");
                            break;
                    }
                    while (pilih != 6)
                        ;

            }
        } while (maxjdsn != 0);
        sc.close();
    }
}