package pkgTumpukan;

public class cElemen {
    private String nama;
    cElemen next;

    cElemen(String nama) {
        this.nama = nama;
        System.out.println("Object Elemen " + nama + " created...");
    }

    public String getNama() {
        return nama;
    }
}
