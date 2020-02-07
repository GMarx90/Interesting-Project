public class GiftShop {
   public static void main(String[] arguments) {
Store store = new Store();

      	store.addItem("C01", "KUBEK", "9.99", "150");
        store.addItem("C02", "DU¯Y KUBEK", "12.99", "28");
        store.addItem("C03", "PODK£ADKA", "10.49", "80");
        store.addItem("E01", "KOSZULKA", "16.99", "9");
        store.addItem("F01", "DZBANEK", "19.99", "35");
        store.addItem("E02", "DU¯Y DZBANEK", "22.99", "8");
        store.addItem("F03", "SKARPETY", "1.49", "180");
        store.addItem("F01", "SPODNIE", "160.99", "9");
        store.sort();

for ( int i=0; i<=store.size;i++){
Item show = store.getItem(i);
System.out.println("\nID Elementu: "+show.getName()+"\nPrice: "+show.getRetail()+"$" +
"\nCurrent Price: "+ show.getPrice +"$"+
"\nQuantity: "+ show.getQuantity());
}
}
}