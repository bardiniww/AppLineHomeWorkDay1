package project;

public abstract class Confection {
    public abstract String  getId();
    public abstract String  getTypeId();
    public abstract Name    getName();
    public abstract double  getWeight();
    public abstract int     getPrice();

    public String toString() {
        return this.getName() + " (product id: " + this.getId() + ", manufacturer id: " + this.getTypeId() + ", weight: " + this.getWeight() + "kg, price: " + this.getPrice() + "rub)";
    }
}
