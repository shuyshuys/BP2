package pkgPalindrom;

public class cItem {
    private String huruf;
    private cItem next;

    cItem(String huruf) {
        this.huruf = huruf;
        next = null;
        // System.out.println("Item " + huruf + " ditambahkan");
    }

    public String getKata() {
        return huruf;
    }

    public void setCekKata(String huruf) {
        this.huruf = huruf;
    }

    public cItem getNext() {
        return next;
    }

    public void setNext(cItem next) {
        this.next = next;
    }
}
