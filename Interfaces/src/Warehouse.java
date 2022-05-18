import java.util.*;
public class Warehouse {
    private Map<String, Integer> warehouse;

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk: " + warehouse.price("milk"));
        System.out.println("coffee: " + warehouse.price("coffee"));
        System.out.println("sugar: " + warehouse.price("sugar"));
    
        System.out.println("----------------");

        warehouse.addStockProduct("coffee", 5, 1);

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
    }
    
    public Warehouse() {
        this.warehouse = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        warehouse.put(product, price);
    }

    public void addStockProduct(String product, int price, int stock) {
        warehouse.put(product, stock);
    }
    
    public int price(String product) {
        Integer howMuch = warehouse.get(product);
        if (howMuch == null) {
            howMuch = -99;
        }
        return howMuch;
    }

    public int stock(String product) {
        Integer howMany = this.warehouse.get(product);
        if (howMany == null) {
            howMany = 0;
        }
        return howMany;
    }
    
    public boolean take(String product) {
        int stock = stock(product);
        
        if (stock > 0) {
            stock--;
            return true;
        }
        return false;
        

    }
}
