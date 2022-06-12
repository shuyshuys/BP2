package BP2.Module20;

public class cDosenTetap extends cPegawai {
    private String nidn;
    private String jabatan;
    private double remunerasi;

    cDosenTetap(String id, String nama, String jabatan, String nidn) {
        super(id, nama);
        this.nidn = nidn;
        this.jabatan = jabatan;
        // this.remunerasi = remunerasi;
        System.out.println("Objek dosen tetap dibuat...");
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setRemunerasi(double remunerasi) {
        this.remunerasi = remunerasi;
    }

    public double getRemunerasi() {
        return remunerasi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("NIDN: " + nidn);
        // System.out.println("Remunerasi: " + remunerasi);
    }
}
