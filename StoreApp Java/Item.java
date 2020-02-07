public class Item implemets Comparable{
    private Intiger id;
    private String name;
    private String retail; 
    private int quantity;
    private double price;

  Item(Intiger id, String name, String retail, String quantity) {
    this.id = id;
    this.name = name;
    this.retail = Double.parseDouble(retail);
    this.quantity = Integer.parseInt(quantity);
    
    if (quantity >= 100){
        price=0.5D*retail;
        price = Math.round(price);
        }
    else if(quantity < 100&& quantity >25){
        price=0.75D*retail;
        price = Math.round(price);
    }
    else{
        price=retail;
    }
    //     price = Math.floor( price * 100 + .5 ) / 100;
    
}
    public int compareTo(Object obj) {        //sortowanie po cenie
        Item temp = (Item) obj;
        if (this.price < temp.price) {
            return 1;
        } else if (this.price > temp.price) {
            return -1;
        }
        return 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRetail() {
        return retail;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

}