package BP2.Module20;

public class cPegawai {
    private String ID;
    private String nama;
    protected double gaji;

    cPegawai(String id, String nama) {
        this.ID = id;
        this.nama = nama;
        System.out.println("Objek pegawai dibuat...");
    }

    private void rahasia() {
        System.out.println("Data Pegawai");
    }

    public void info() {
        rahasia();
        System.out.println("ID: " + ID);
        System.out.println("Nama: " + nama);
    }

    public void setID(String id) {
        this.ID = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getID() {
        return ID;
    }

    public String getNama() {
        return nama;
    }
}
