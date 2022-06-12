package BP2.pkgWarung3;

public class cWarung {
    private String nama;
    private String alamat;

    cWarung() {
        System.out.println("Objek warung dibuat...");
    }

    cWarung(String n, String a) {
        nama = n;
        alamat = a;
        System.out.println("Objek " + nama + " dibuat...");
    }

    public void setAlamat(String a) {
        alamat = a;
    }

    // getter dilengkapi sendiri
    public String ToString() {
        return nama + " [" + alamat + "]";
    }
}
