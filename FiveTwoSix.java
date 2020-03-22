public class FiveTwoSix {
    public static void main() {
        UnitsHandler large = new UnitsHandler(100);
        System.out.println("unitsPerContainer = " + large.unitsPerContainer);
        System.out.println();
        
        UnitsHandler.update(8);
        System.out.println("container = " + large.containers);
        System.out.println();
        System.out.println("totalUnits = " + large.totalUnits);
        System.out.println();
        System.out.println("(static variables set to public for project purposes)");
    }
}