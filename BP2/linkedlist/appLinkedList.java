package BP2.linkedlist;

public class appLinkedList {
    public static void main(String[] args) {
        cNode n1 = new cNode("Budi");
        cNode n2 = new cNode("Ima");
        // cNode n3 = new cNode("Wati");

        n1.next = n2;
        n2.next = null; // n3;
        // n3 = null;

        System.out.println(n1.getNama());
        System.out.println((n1.next).getNama());
        System.out.println((n1.next.next).getNama());
    }
}
