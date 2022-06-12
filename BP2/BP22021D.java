package BP2;

class Barang {
    // data, variable
    String nama;
    int harga;

    // menthod, fungsi
    void isiBarang(String n, int h) {
        nama = n;
        harga = h;
    }

    void lihatBarang() {
        System.out.println("Nama : " + nama);
        System.out.println("Harga : " + harga);
    }
}

public class BP22021D {
    // deklarasi variabel global
    // menthod2 tambahan
    public static void main(String[] args) {
        // deklarasi variabel
        Barang barang1 = new Barang();
        Barang barang2 = new Barang();
        // inisialisasi variabel
        barang1.isiBarang("Bakso", 15000);
        barang2.isiBarang("Buku tulis", 10000);
        // pemanggilan method
        barang1.lihatBarang();
        barang2.lihatBarang();
    }
}
