package BP2.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class appCalc {
    public static void main(String[] args) {
        // buat antarmuka
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        // panel atas dan panel bawah
        JPanel panelAtas = new JPanel();
        JPanel panelBawah = new JPanel();
        JLabel labelOperasi = new JLabel("Operasi");
        // buat textfield
        JTextField txtInput1 = new JTextField(10);
        // buat agar rata kanan seperti layar kalkulator
        txtInput1.setHorizontalAlignment(JTextField.RIGHT);
        JTextField txtInput2 = new JTextField(10);
        txtInput2.setHorizontalAlignment(JTextField.RIGHT);
        JLabel labelSamaDengan = new JLabel(" = ");
        JTextField txtHasil = new JTextField(10);
        txtHasil.setHorizontalAlignment(JTextField.RIGHT);

        // buat tombol
        JButton jumlah = new JButton(" + ");
        JButton kurang = new JButton(" - ");
        JButton kali = new JButton(" * ");
        JButton bagi = new JButton(" / ");

        // tambahkan komponen ke dalam kontainer
        panelAtas.add(txtInput1);
        panelAtas.add(labelOperasi);
        panelAtas.add(txtInput2);
        panelAtas.add(labelSamaDengan);
        panelAtas.add(txtHasil);

        panelBawah.add(jumlah);
        panelBawah.add(kurang);
        panelBawah.add(kali);
        panelBawah.add(bagi);

        // pasangkan panel ke frame
        // frame.add(panelAtas, BorderLayout.NORTH);
        frame.getContentPane().add(BorderLayout.NORTH, panelAtas);
        frame.getContentPane().add(BorderLayout.CENTER, panelBawah);
        frame.setVisible(true);

        // tambahkan aksi untuk setiap tombol
        jumlah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtInput1.getText());
                int b = Integer.parseInt(txtInput2.getText());
                int hasil = a + b;
                txtHasil.setText(String.valueOf(hasil));
            }
        });
        kurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtInput1.getText());
                int b = Integer.parseInt(txtInput2.getText());
                int hasil = a - b;
                txtHasil.setText(String.valueOf(hasil));
            }
        });
        kali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtInput1.getText());
                int b = Integer.parseInt(txtInput2.getText());
                int hasil = a * b;
                txtHasil.setText(String.valueOf(hasil));
            }
        });
        bagi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtInput1.getText());
                int b = Integer.parseInt(txtInput2.getText());
                int hasil = a / b;
                txtHasil.setText(String.valueOf(hasil));
            }
        });
    }
}
