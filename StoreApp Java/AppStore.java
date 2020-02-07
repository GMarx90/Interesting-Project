public class GiftShop {
   public static void main(String[] arguments) {
Store store = new Store();

      	store.addItem("C01", "KUBEK", "9.99", "150","YES");
        store.addItem("C02", "DUŻY KUBEK", "12.99", "28","NO");
        store.addItem("C03", "PODKŁADKA", "10.49", "80","YES");
        store.addItem("E01", "KOSZULKA", "16.99", "9","NO");
        store.addItem("F01", "DZBANEK", "19.99", "35","NO");
        store.addItem("E02", "DUŻY DZBANEK", "22.99", "8","YES");
        store.addItem("F03", "SKARPETY", "1.49", "180","NO");
        store.addItem("F01", "SPODNIE", "160.99", "9","YES");
        store.sort();

for ( int i=0; i<=store.size;i++){
Item show = store.getItem(i);
System.out.println("\nID Elementu: "+show.getName()+"\nPrice: "+show.getRetail()+"$" +
"\nCurrent Price: "+ show.getPrice +"$"+
"\nQuantity: "+ show.getQuantity());
}
}
}
