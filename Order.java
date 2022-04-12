import java.util.ArrayList;

public class Order {

    // Class Attributes

    private String name;
    private double total;
    private boolean ready = false;
    private ArrayList<Item> items;

    //Static Member

    // Constructor

    public Order(String name) {
        this.name = name;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public double getTotal() {
        return total;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }



    // Static Method


    // Class Methods

    public void orderDetails() {
        System.out.printf("Order Name: %s\t Order Total: %.2f\n", name, total);

        if (this.ready == false) {
            System.out.println("Order is not ready.");
        }
        else {
            System.out.println("Order is ready!");
        }
    }

    public void getOrderTotal(double price) {
        this.total+=price;
    }

    // public void addItem(object item) {
    //     this.items.add(item);
    // }

    public void orderReady() {
        this.ready = true;
    }

}