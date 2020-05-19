package project.confections;

import project.Confection;
import project.Name;
import project.factories.ManufacturerIdFactory;
import project.factories.ProductIdFactory;

public class Mars extends Confection {
    private static final String manufacturerId;
    private static final Name   name;
    private static final double weight;
    private static final int    price;
    private final String productId;

    static {
        manufacturerId = ManufacturerIdFactory.createTypeId();
        name = Name.MARS;
        weight = 0.12;
        price = 2;
    }

    public Mars() {
        productId = ProductIdFactory.createId();
    }

    public static String getTypeIdValue() { return manufacturerId; }

    public String getTypeId() { return getTypeIdValue(); }

    public String getId() { return productId; }

    public Name getName() { return name; }

    public double getWeight() { return weight; }

    public int getPrice() { return price; }
}
