package BP2.pkgWarung3;

public class cPemilik {
    private String nama;
    private String alamat;
    private cWarung warung;

    cPemilik() {
        System.out.println("Objek pemilik dibuat...");
    }

    cPemilik(String n, String a) {
        nama = n;
        alamat = a;
        System.out.println("Objek" + nama + " dibuat...");
    }

    public void setAlamat(String a) {
        alamat = a;
    }

    public void setNama(String n) {
        nama = n;
    }

    public String ToString() {
        return nama + " [" + alamat + "]";
    }

    public void buatWarung(cWarung w) {
        warung = w;
        System.out.println("Objek warung dibuat...");
    }

    public void lihatWarung() {
        // System.out.println("\n");
        if (warung != null) {
            System.out.println("  " + nama + " pemilik Warung: " + warung.ToString());
        } else
            System.out.println("  " + nama + " tidak memiliki warung!");

    }

    public void hapusWarung() {
        warung = null;
        System.out.println("  Warung " + nama + " telah dihapus...");
    }
}
