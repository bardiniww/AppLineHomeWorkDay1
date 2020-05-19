package project.factories;

public class ManufacturerIdFactory {
    private static long typeId;

    private ManufacturerIdFactory() { ; }

    public static synchronized String createTypeId() {
        return "" + typeId++;
    }
}
