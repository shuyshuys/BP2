public class cLinkedList {
    cSimpul head, tail;
    int jumlah; // menyimpan jumlah simpul di linked list

    public void tambahDepan(cSimpul baru) {
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.next = head;
            head = baru;
        }
        System.out.println("Penambahan sukses!");
    }

    public void lihatLinkedList() {
        System.out.print("Isi Linked List: ");
        for (cSimpul ) {
System.out.print(tt.getData());
}
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
