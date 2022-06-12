package BP2.swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class appBelajarGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        System.out.println("Mulai GUI");
        String nama = JOptionPane.showInputDialog(frame, "Masukkan Nama");
        String tahun = JOptionPane.showInputDialog(frame, "Masukkan Tahun Lahir");
        int t = Integer.parseInt(tahun);
        int umur = 2021 - t;
        JOptionPane.showMessageDialog(frame, nama + " - " + umur + " tahun");
        frame.dispose();
        System.out.println("Selesai GUI");
    }
}
