package pkgTumpukan;

public class cTumpukan {
    cElemen top, bottom;
    int jumlah;

    cTumpukan() {
        top = null;
        bottom = null;
        jumlah = 0;
        System.out.println("Object Tumpukan created...");
    }

    public void push(cElemen baru) {
        // cElemen baru = new cElemen(nama);
        if (top == null) {
            top = baru;
            bottom = baru;
        } else {
            baru.next = top;
            top = baru;
        }
        jumlah++;
    }

    public cElemen pop() {
        if (top == null) {
            System.out.println("Tumpukan kosong");
            return null;
        } else if (top.next == null) {
            cElemen t = top;
            top = bottom = null;
            System.out.println("POP OK!");
            return t;
        } else {
            cElemen t = top;
            top = top.next;
            t.next = null;
            jumlah--;
            System.out.println("POP OK!");
            return t;
        }
    }

    public void display() {
        if (top == null) {
            System.out.println("Tumpukan kosong!");
        } else {
            cElemen temp = top;
            System.out.print("Isi Stack: ");
            while (temp != null) {
                // System.out.println(temp.getNama());
                System.out.print("[" + temp.getNama() + "]   ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
