
public class AppStore {
    public static void main(String[] arguments) {
        Store store = new Store();
        store.addItem("C01", "KUBEK", "9.99", "150", "NIE");
        store.addItem("C02", "DUŻY KUBEK", "12.99", "82", "TAK");
        store.addItem("C03", "PODKŁADKA", "10.49", "800", "NIE");
        store.addItem("D01", "KOSZULKA", "16.99", "90", "TAK");
        store.addItem("C01", "KUBEK", "9.99", "150", "NIE");
        store.addItem("C02", "DUŻY KUBEK", "12.99", "82", "TAK");
        store.addItem("C03", "PODKŁADKA", "10.49", "800", "NIE");
        store.addItem("D01", "KOSZULKA", "16.99", "90", "TAK");
        store.addItem("C01", "KUBEK", "9.99", "150", "YES");
        store.addItem("C02", "DUŻY KUBEK", "12.99", "28", "NO");
        store.addItem("C03", "PODKŁADKA", "10.49", "80", "YES");
        store.addItem("E01", "KOSZULKA", "16.99", "9", "NO");
        store.addItem("F01", "DZBANEK", "19.99", "35", "NO");
        store.addItem("E02", "DUŻY DZBANEK", "22.99", "8", "YES");
        store.addItem("F03", "SKARPETY", "1.49", "180", "NO");
        store.addItem("F01", "SPODNIE", "160.99", "9", "YES");
        store.sort();

        for (int i = 0; i < store.getSize(); i++) {
            Item show = (Item)store.getItem(i);
            System.out.println("\nIdentyfikator elementu: " + show.getId() +
                    "\nNazwa: " + show.getName() +
                    "\nCena sprzedaży: " + show.getRetail() + " zł" +
                    "\nCena: " + show.getPrice() + " zł" +
                    "\nSztuk: " + show.getQuantity());
        }
    }
}

