package Kasir;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class mineWriter {
    public static void write(String path, String[] category, String[] menu, int[] harga, int[] porsi) {
        // try {
        File file = new File(path);
        // if (file.createNewFile()) {
        // System.out.println("File created: " + file.getName());
        // } else {
        // System.out.println("File already exists with name " + file.getName());
        // }
        // } catch (IOException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }
        // menulis ke file
        if (menu != null) {
            try {
                FileWriter writer = new FileWriter(path);
                for (int i = 0; i < menu.length; i++) {
                    System.out.print(menu[i] + "  ");
                    System.out.print(harga[i] + "  ");
                    System.out.print(porsi[i] + "  ");
                    writer.write(menu[i] + "\n");
                    writer.write(harga[i] + "\n");
                    writer.write(porsi[i] + "\n");
                    writer.write("\n");
                }
                writer.close();
                System.out.println("Successfully wrote to " + file.getName());
                System.out.println();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
    //
    // public static void writeMenuMakanan() {
    // // cek file
    // try {
    // File myObj = new File("./src/Kasir/menuMakanan.txt");
    // if (myObj.createNewFile()) {
    // System.out.println("File created: " + myObj.getName());
    // } else {
    // System.out.println("File already exists with name " + myObj.getName());
    // }
    // } catch (IOException e) {
    // System.out.println("An error occurred.");
    // e.printStackTrace();
    // }
    // // menulis ke file
    // try {
    // FileWriter writeMakanan = new FileWriter("./src/Kasir/menuMakanan.txt");
    // for (int i = 0; i < Main.menuMakanan.length; i++) {
    // System.out.println(Main.menuMakanan[i]);
    // writeMakanan.write(Main.menuMakanan[i]);
    // writeMakanan.write("\n");
    // }
    // writeMakanan.close();
    // System.out.println("Successfully wrote to the file.");
    // System.out.println();
    // } catch (IOException e) {
    // System.out.println("An error occurred.");
    // e.printStackTrace();
    // }
    // }

    // public static void writeMenuMinuman() {
    // try {
    // File fileMinuman = new File("./src/Kasir/menuMinuman.txt");
    // if (fileMinuman.createNewFile()) {
    // System.out.println("File created: " + fileMinuman.getName());
    // } else {
    // System.out.println("File already exists.");
    // }
    // } catch (IOException e) {
    // System.out.println("An error occurred.");
    // e.printStackTrace();
    // }
    // try {
    // FileWriter writeMinuman = new FileWriter("./src/Kasir/menuMinuman.txt");
    // for (int i = 0; i < Main.menuMinuman.length; i++) {
    // System.out.println(Main.menuMinuman[i]);
    // writeMinuman.write(Main.menuMinuman[i]);
    // writeMinuman.write("\n");
    // }
    // writeMinuman.close();
    // System.out.println("Successfully wrote to the file.");
    // System.out.println();
    // } catch (IOException e) {
    // System.out.println("An error occurred.");
    // e.printStackTrace();
    // }
    // }
}
