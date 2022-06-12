package BP2.pkgWarung4;

public class cPembeli {
    private String nama;

    cPembeli() {
        nama = "anonymous";
        System.out.println("Objek pembeli dibuat...");
    }

    cPembeli(String n) {
        nama = n;
        System.out.println("Objek " + nama + " dibuat...");
    }

    public void setNama(String n) {
        this.nama = n;
    }

    public String getNama() {
        return nama;
    }

    public String ToString() {
        return "Nama Pembeli: " + nama;
    }
}
