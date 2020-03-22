public class UnitsHandler {
    public static int totalUnits = 0;
    public static int containers = 0;
    public static int unitsPerContainer = 0;
    public UnitsHandler(int containerSize) {
        unitsPerContainer = containerSize;
    }
    public static void update(int c) {
        containers = c;
        totalUnits = unitsPerContainer * containers;
    }
}