package BP2.Module20;

public class cDosen extends cPegawai {
    // String jabatan;
    // double tunjangan;
    String jabfung;

    cDosen(String id, String nama, String jabfung) {
        /*
         * pemanggilan constructor class induk
         * parameter id dan dm dikirimke contructor class induk
         */
        super(id, nama);
        this.jabfung = jabfung;
        System.out.println("Objek dosen dibuat...");
    }

    // set jabfung
    public void setJabatan(String jabfung) {
        this.jabfung = jabfung;
    }

    // get jabfung
    public String getJabatan() {
        return jabfung;
    }

    @Override
    // nama menthod class anak sama dengan class induk
    public void info() {
        super.info();
        System.out.println("Jabatan: " + jabfung);
    }
}
