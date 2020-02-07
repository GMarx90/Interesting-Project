
import java.util.*;

public class Store{
private LinkedList offert = new LinkedList();
public Item item;
public void addItem(Intiger id, String name, String price, String quantity){
    
Item item = new Item (id, name, price, quantity);
    offert.add(item);
}

   public Item getItem(int i) {
        return (Item) offert.get(i);
    }
    
    public int getSize(){
        return offert.size;
    }
  public void sort() {
        Collections.sort(offert);
    }
}

