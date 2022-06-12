package BP2.UTS.BismisllahGUI;

public class cMenu {
    private String kode, nama;
    private double harga;

    cMenu(String nama, double harga, String menu) {
        this.nama = nama;
        this.harga = harga;
        System.out.println("Objek " + menu + " dengan nama " + nama + " dibuat...");
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getKode() {
        return kode;
    }

    public String ToString() {
        return "Nama Makanan: " + nama + "\t[Harga: " + harga + "]";
    }
}
