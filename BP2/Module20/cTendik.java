package BP2.Module20;

public class cTendik extends cPegawai {
    private String golongan;

    cTendik(String id, String nama, String golongan) {
        super(id, nama);
        this.golongan = golongan;
        System.out.println("Objek tendik dibuat...");
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getGolongan() {
        return golongan;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Golongan: " + golongan);
    }
}
