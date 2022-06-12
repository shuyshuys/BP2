package BP2.linkedlist;

public class cNode {
    private String nama;
    cNode next;

    cNode(String nama) {
        this.nama = nama;
        System.out.println("Object Node " + nama + " dibuat...");
    }

    public String getNama() {
        return nama;
    }

    // public void setNama(String nama) {
    // this.nama = nama;
    // }
    public cNode getNext() {
        return next;
    }

    public void setNext(cNode next) {
        this.next = next;
    }
}
