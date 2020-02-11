

public class Item implements Comparable{
    private Integer id;
    private String name;
    private double retail;
    private int quantity;
    private double price;
    private boolean noDiscount;
    Item(Integer id, String name, double retail, int quantity, boolean noDiscount) {
        this.id = id;
        this.name = name;
        this.retail = retail;
        this.quantity = quantity;
        this.noDiscount=noDiscount;


        if (noDiscount)
            price = retail;
        else{
            if (quantity >= 100){
                price=0.5D*retail;
                price = Math.round(price);
            }
            else if(quantity < 100&& quantity >25){
                price=0.75D*retail;
                price = Math.round(price);
            }}

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

    public Integer getId() {
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
