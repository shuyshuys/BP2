package BP2;

public class cLinkedList {
    // single linked list
    cSimpul head, tail;
    int jumlah; // menyimpan jumlah simpul di linked list

    public void tambahDepan(cSimpul baru) {
        if (head == null) {
            head = baru;
            tail = baru;
            // head=tail=baru3
        } else { // head bukan null, linked list sudah berisi
            baru.next = head; // sambungkan dulu link nya
            head = baru; // update posisi ujung linked list
        }
        System.out.println("Penambahan sukses!");
    }

    public void lihatLinkedList() {
        System.out.print("Isi Linked List: ");
        for (cSimpul t = head; t != null; t = t.next) {
            System.out.print("[" + t.getData() + "]");
        }
        System.out.println();
    }

    public void hapusDepan() {
        if (head == null) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = tail = null;
        } else { // berisi 2 impul
            cSimpul t = head;
            System.out.println("[" + t.getData() + "] dihapus");

            head = head.next;
            t = null;
        }
    }
}
