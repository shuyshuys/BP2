package BP2.pkgWarung3;

public class cMinuman {
    private String nama;
    private int harga;

    cMinuman(String n, int h) {
        nama = n;
        harga = h;
        System.out.println("Object " + nama + " dibuat...");
    }

    // setter
    public void setNama(String n) {
        nama = n;
    }

    public void setHarga(int h) {
        harga = h;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String ToString() {
        return nama + "[" + harga + "]";
    }
}
