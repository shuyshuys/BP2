package Kasir;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class mineReader {
    public static int idx;

    public static void getReader(String path, String category) {
        try {
            File file = new File(path);
            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);

            long lineCount = Files.lines(Paths.get(path)).count();
            idx = (int) lineCount;
            if (category == "Menu Makanan") {
                Main.menuMakanan = new String[idx];
                for (int i = 0; i < Main.menuMakanan.length; i++) {
                    System.out.println(bufferedReader.readLine());
                    Main.menuMakanan[i] = bufferedReader.readLine();
                    System.out.println(Main.menuMakanan[i]);
                }
                Main.categoryMakan = new String[idx];
            } else if (category == "Menu Minuman") {
                Main.menuMinuman = new String[idx];
                Main.categoryMinum = new String[idx];
            } else if (category == "Menu Snack") {
                Main.menuSnack = new String[idx];
                Main.categorySnack = new String[idx];
            } else {
                System.out.println("String[idx] error occured");
            }

            String line;
            int i = 0;

            while ((line = bufferedReader.readLine()) != null) {
                if (category == "Menu Makanan") {
                    Main.menuMakanan[i] = line;
                    Main.categoryMakan[i] = category;
                    // System.out.print(Main.menuMakanan[i] + " ");
                } else if (category == "Menu Minuman") {
                    Main.menuMinuman[i] = line;
                    Main.categoryMinum[i] = category;
                    // System.out.print(Main.menuMinuman[i] + " ");
                } else if (category == "Menu Snack") {
                    Main.menuSnack[i] = line;
                    Main.categorySnack[i] = category;
                    // System.out.print(Main.menuSnack[i] + " ");
                } else {
                    System.out.println("Print error occured");
                }
                i++;
            }
            reader.close();
            System.out.println("List " + category + " di import dari " + file.getName());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void getReaderInt(String path, String category) {
        try {
            File file = new File(path);
            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);

            long lineCount = Files.lines(Paths.get(path)).count();
            idx = (int) lineCount;
            if (category == "Harga Makanan") {
                Main.hargaMakanan = new int[idx];
            } else if (category == "Harga Minuman") {
                Main.hargaMinuman = new int[idx];
            } else if (category == "Harga Snack") {
                Main.hargaSnack = new int[idx];
            } else {
                System.out.println("int[] error occured");
            }

            String line;
            int i = 0;

            while ((line = bufferedReader.readLine()) != null) {
                if (category == "Harga Makanan") {
                    Main.hargaMakanan[i] = Integer.parseInt(line);
                    // System.out.print(Main.hargaMakanan[i] + " ");
                } else if (category == "Harga Minuman") {
                    Main.hargaMinuman[i] = Integer.parseInt(line);
                    // System.out.print(Main.hargaMinuman[i] + " ");
                } else if (category == "Harga Snack") {
                    Main.hargaSnack[i] = Integer.parseInt(line);
                    // System.out.print(Main.hargaSnack[i] + " ");
                } else {
                    System.out.println("Print error occured");
                }
                i++;
            }
            reader.close();
            System.out.println("List " + category + " di import dari " + file.getName());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
