package BP2.UTS.BismisllahGUI;

public class cPelanggan {
    private String id, nama;
    private String alamat;

    cPelanggan(String id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("Objek pelanggan " + nama + " dibuat...");
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getID() {
        return id;
    }

    public String getAlamat() {
        return alamat;
    }
}
