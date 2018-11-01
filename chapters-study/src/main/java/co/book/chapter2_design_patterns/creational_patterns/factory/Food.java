package co.book.chapter2_design_patterns.creational_patterns.factory;

public abstract class Food {
    private int quantity;
    public Food(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public abstract void consumed();


}
