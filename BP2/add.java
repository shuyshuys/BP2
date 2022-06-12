package BP2;

import java.util.Scanner;

public class add {
    public static Scanner sc() {
        return new Scanner(System.in);
    }

    public static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void border() {
        System.out.println("=================================================");
    }
}
