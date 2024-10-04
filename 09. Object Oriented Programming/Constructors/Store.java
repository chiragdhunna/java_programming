class Product {
    private int itemNumber;
    private String name;
    private double price;
    private int quantity;

    Product() {
        this.itemNumber = 0;
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
    }

    Product(int itemNumber, String name, double price, int quantity) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

class Customer {
    private int customerId;
    private String name;
    private String address;
    private String phoneNumber;

    Customer() {
        this.customerId = 0000;
        this.name = "";
        this.address = "";
        this.phoneNumber = 000000000;
    }

    Customer(int customerId, String name, String address, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Store {
    public static void main(String[] args) {
        Customer customer = new Customer(01001, "Chirag", "India", "9353348691");
        Product product1 = new Product(0, "XBOX", 100, 10);
        Product product2 = new Product(1, "PS5", 500, 13);
        Product product3 = new Product(2, "PC", 200, 50);
        Product product4 = new Product(3, "Console", 50, 69);
        Product product5 = new Product(4, "Keyboard", 130, 1244);
        Product product6 = new Product(5, "Drone", 980, 68);

    }
}
