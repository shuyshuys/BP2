package BP2.UTS.BismisllahGUI;

public class cPembelian {
    private cPelanggan pelanggan;
    private cMenu menu;
    private String kode;

    cPembelian(String kode, cPelanggan pelanggan, cMenu menu) {
        this.kode = kode;
        this.pelanggan = pelanggan;
        this.menu = menu;
        System.out.println("Objek pembelian " + kode + " dibuat...");
    }

    public String ToString() {
        String t = "";
        t = t + menu.getNama() + "\t";
        t = t + menu.getHarga() + "\n";
        return t;
    }

    public void setMenu(cMenu menu) {
        this.menu = menu;
    }

    public void setPelanggan(cPelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public cMenu getMenu() {
        return menu;
    }

    public cPelanggan getPelanggan() {
        return pelanggan;
    }

    public String getKode() {
        return kode;
    }
}
