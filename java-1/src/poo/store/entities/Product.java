package poo.store.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantityToAdd) {
        this.quantity += quantityToAdd;
    }

    public void removeProducts(int quantityToRemove) {
        int currentProductQuantity = this.quantity;

        if ((currentProductQuantity - quantityToRemove) < currentProductQuantity) {
            this.quantity -= quantityToRemove;
        }
    }

    public String toString() {
        return String.format("%s, R$%.2f, %d unidade(s). Total: R$%.2f", name, price, quantity, totalValueInStock());
    }
}
