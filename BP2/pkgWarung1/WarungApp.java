/*
 program ttg Warung/Toko
 1. Narasi: Budi membeli Soto dan Es Jeruk
 2. CLass: pembeli, makanan, minuman
 3. Melengkapi isi class: data, method
 4. Membuat program utama
 */
package BP2.pkgWarung1;

import java.util.Scanner;

class pembeli {
    // data
    String nama;
    int usia;

    // method
    pembeli() { // default contructor
        nama = "";
        usia = 0;
        System.out.println("Object pembeli dibuat...");
    }

    pembeli(String n, int u) { // parameterized constructor
        nama = n;
        usia = u;
        System.out.println("Object pembeli dibuat...");
    }

    // setter --> mengisi/menulis data
    public void setNama(String n) {
        nama = n;
    }

    public void setUsia(int u) {
        usia = u;
    }

    // getter --> membaca data
    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    // toString --> mengubah data menjadi teks
    public String isiObjek() {
        return nama + "[" + usia + "]";
    }
}

class makanan {

}

class minuman {

}

public class WarungApp {
    public static void main(String[] args) {
        pembeli pb = new pembeli("Budi", 20);
        Scanner sc = new Scanner(System.in);
        int pilih = 0;
        do {
            System.out.println();
            System.out.println("Warung Sederhana");
            System.out.println("1. Lihat Pembeli");
            System.out.println("2. Ubah Pembeli");
            System.out.println("3. Hapus Pembeli");
            System.out.println("4. Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            System.out.println();
            switch (pilih) {
                case 1:
                    String t = pb.isiObjek();
                    System.out.println("Pembeli : " + t);
                    break;
                case 2:
                    System.out.println("Ubah nama = ");
                    String n = sc.next();
                    pb.setNama(n);
                    System.out.println("Nama berhasil diubah");

                    System.out.print("Ubah usia : ");
                    int u = sc.nextInt();
                    pb.setUsia(u);
                    System.out.println("Usia berhasil diubah");
                    break;
                case 3:
                    pb.setNama("");
                    pb.setUsia(0);
                    System.out.println("Pembeli berhasil dihapus");
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (pilih != 4);
        sc.close();
    }
}
