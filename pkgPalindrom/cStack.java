package pkgPalindrom;

public class cStack {
    cItem head, tail;

    cStack() {
        head = null;
        tail = null;
    }

    public void push(cItem item) {
        if (head == null) {
            head = item;
            tail = item;
        } else {
            item.setNext(head);
            head = item;
        }
    }

    public String pop() {
        if (head == null) {
            System.out.println("Tumpukan kosong");
            return null;
        } else if (head.getNext() == null) {
            cItem temp = head;
            head = null;
            tail = null;
            return temp.getKata();
        } else {
            cItem temp = head;
            head = head.getNext();
            return temp.getKata();
        }
    }

    public void print() {
        cItem temp = head;
        while (temp != null) {
            System.out.println(temp.getKata());
            temp = temp.getNext();
        }
    }
}
