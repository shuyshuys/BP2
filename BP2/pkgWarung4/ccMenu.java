package BP2.pkgWarung4;

//induk dari class makanan dan class minuman

public class ccMenu {
    private String nama;
    private int harga;

    ccMenu(String n, int h) {
        nama = n;
        harga = h;
        System.out.println("Objek " + nama + " dibuat...");
    }

    public void setNama(String n) {
        nama = n;
    }

    public void setHarga(int h) {
        harga = h;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String ToString() {
        return "Nama Makanan: " + nama + "\n\tHarga: " + harga;
    }
}
