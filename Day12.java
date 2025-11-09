import java.util.*;

public class Day12 {
    static class Cart {
        private Map<String, Integer> items = new HashMap<>();

        public void addItem(String item, int price) {
            items.put(item, items.getOrDefault(item, 0) + price);
        }

        public void displayBill() {
            int total = items.values().stream().mapToInt(i -> i).sum();
            System.out.println("Items: " + items);
            System.out.println("Total Bill: ₹" + total);
        }
    }

    public static void main(String[] args) {
        Cart c = new Cart();
        c.addItem("Laptop", 60000);
        c.addItem("Mouse", 700);
        c.addItem("Laptop", 60000); // duplicate add
        c.displayBill();
    }
}
