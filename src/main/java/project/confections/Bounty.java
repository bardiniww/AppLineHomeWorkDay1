package project.confections;

import project.Confection;
import project.Name;
import project.factories.ManufacturerIdFactory;
import project.factories.ProductIdFactory;

public class Bounty extends Confection {
    private static final String manufacturerId;
    private static final Name   name;
    private static final double weight;
    private static final int    price;
    private final String productId;

    static {
        manufacturerId = ManufacturerIdFactory.createTypeId();
        name = Name.BOUNTY;
        weight = 0.19;
        price = 7;
    }

    public Bounty() {
        productId = ProductIdFactory.createId();
    }

    public static String getTypeIdValue() { return manufacturerId; }

    public String getTypeId() { return getTypeIdValue(); }

    public String getId() { return productId; }

    public Name getName() { return name; }

    public double getWeight() { return weight; }

    public int getPrice() { return price; }
}