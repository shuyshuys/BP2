package BP2.UTS.BismisllahGUI;

/*
 * @shuyasetsuna | 21082010129 | Ahmad Yazid Isnandar
 * Terdapat proses konfirmasi tindakan (Lanjut/Batal) sebelum dilakukan  pengubahan, dan penghapusan data; baik di menu Barang maupun Transaksi
 */

// import javax.swing.*;
// import javax.swing.table.DefaultTableModel;

public class appWarungGUI extends javax.swing.JFrame {
    cPelanggan pelanggan[];
    cMenu menu[];
    cPembelian pembelian[];
    int jpelanggan, jmenu, jpembelian; // indexs array
    int mpelanggan, mmenu, mpembelian; // max indexs array
    // constructor

    public appWarungGUI() {
        // setLocationRelativeTo(null);
        // setTitle("Bismisllah");
        // setResizable(false);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pelanggan = new cPelanggan[3];
        menu = new cMenu[5];
        pembelian = new cPembelian[15];
        jpelanggan = 0;
        jmenu = 0;
        jpembelian = 0;
        mpelanggan = 10;
        mmenu = 10;
        mpembelian = 10;
        // initComponents();
    }
}
