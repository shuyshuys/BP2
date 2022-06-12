package BP2.pkgLinkedList;

public class cSimpul {
    cBarang data;
    cSimpul next;

    cSimpul(cBarang d) {
        data = d;
    }

    public String getData() {
        return data.getNama();
    }
}
