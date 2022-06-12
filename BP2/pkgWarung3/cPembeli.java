package BP2.pkgWarung3;

public class cPembeli {
    private String nama;
    private String alamat;
    private cMakanan makanan;
    private cMinuman minuman;
    // create update delete menampilkan

    public void beliMakanan(cMakanan m) {
        makanan = m;
        System.out.println("Pembelian sukses...");
    }

    public void lihatMakanan() {
        if (makanan != null)
            System.out.println("Pembeli membeli makanan " + makanan.ToString());
        else
            System.out.println("Belum ada makanan!");
    }

    public void ubahMakanan(cMakanan m) {
        makanan = m;
        System.out.println("Pengubahan sukses...");
    }

    public void hapusMakanan() {
        makanan = null;
        System.out.println("Penghapusan sukses...");
    }

    public void beliMinuman(cMinuman m) {
        minuman = m;
        System.out.println("Pembelian sukses...");
    }

    public void lihatMinuman() {
        if (minuman != null)
            System.out.println("Pembeli membeli minuman " + minuman.ToString());
        else
            System.out.println("Belum ada minuman!");
    }

    public void ubahMinuman(cMinuman n) {
        minuman = n;
        System.out.println("Pengubahan sukses...");
    }

    public void hapusMinuman() {
        minuman = null;
        System.out.println("Penghapusan sukses...");
    }

    cPembeli(String n, String a) {
        nama = n;
        alamat = a;
        System.out.println("Object " + nama + " dibuat...");
    }

    // setter
    public void setNama(String n) {
        nama = n;
    }

    public void setAlamat(String a) {
        alamat = a;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    // ToString
    public String ToString() {
        return nama + "[" + alamat + "]";
    }
}
