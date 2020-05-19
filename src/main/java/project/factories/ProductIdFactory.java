package project.factories;

public class ProductIdFactory {
    private static long id;

    private ProductIdFactory() {
        ;
    }

    public static synchronized String createId() {
        return "" + id++;
    }
}
