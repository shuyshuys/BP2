package BP2.pkgWarung4;

import java.util.Scanner;

/*
cPembelian di video
mempertemukan objek pembeli dengan objek makanan
satu orang bisa membeli banyak makanan sekaligus
*/
public class pembelian {
    private Scanner sc = new Scanner(System.in);
    cPembeli pembeli;
    cMakanan makanan[];
    private int jMkn, maxMkn; // , total;

    pembelian() {
        // bisa ditambahkan nomor nota
        maxMkn = 5;
        makanan = new cMakanan[maxMkn];
        jMkn = 0;
        // total = 0;
        System.out.println("Objek nota dibuat...");
    }

    public void isiPembeli(cPembeli p) {
        pembeli = p;
        System.out.println("Isi pembeli sukses..");
    }

    public void tambahMakanan(cMakanan m) {
        if (jMkn < maxMkn) {
            makanan[jMkn] = m;
            jMkn++;
        } else {
            System.out.println("Makanan sudah penuh!");
        }
    }

    public void hapusMakanan() {
        if (jMkn < 0) {
            System.out.println("Makanan kosong!");
        } else {
            System.out.print("Makanan yang dihapus: ");
            String mkn = sc.nextLine(); // line
            boolean ada = false;
            for (int i = 0; i < jMkn; i++) {
                if (mkn.equalsIgnoreCase(makanan[i].getNama())) {
                    ada = true;
                    // makanan[i] = makanan[jMkn - 1];
                    // jMkn--;
                    makanan[i] = null;
                    // menggeser makanan ke kiri
                    int p = i;
                    for (int j = p; j < jMkn; j++) {
                        if (j == jMkn - 1) {
                            makanan[j] = null;
                        } else {
                            makanan[j] = makanan[j + 1];
                        }
                    }
                    System.out.println("Penghapusan sukses!");
                    break;
                }
            }
            if (ada == false) {
                System.out.println("Makanan tidak ditemukan!");
            }
        }
    }

    public void lihatPembelian() {
        System.out.println("----- DATA PEMBELI -----");
        System.out.println(pembeli.ToString());
        for (int i = 0; i < jMkn - 1; i++) {
            System.out.println((i + 1) + ". " + makanan[i].ToString());
        }
        System.out.println();
    }
}
