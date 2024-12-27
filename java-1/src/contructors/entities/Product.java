package contructors.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrime(double price) {
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantityToAdd) {
        this.quantity += quantityToAdd;
    }

    public void removeProducts(int quantityToRemove) {

        if (this.quantity <= quantityToRemove) {
            this.quantity = 0;
            return;
        }

        this.quantity -= quantityToRemove;
    }

    public String toString() {
        return String.format("%s, R$%.2f, %d unidade(s). Total: R$%.2f", name, price, quantity, totalValueInStock());
    }
}
