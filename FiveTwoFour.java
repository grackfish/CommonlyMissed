public class FiveTwoFour {
    public static void main() {
        Gadget a = new Gadget();
        System.out.println(Gadget.status);
        System.out.println();
        
        Gadget.setStatus(3);
        System.out.println(Gadget.status);
        System.out.println();
        
        Gadget b = new Gadget();
        System.out.println(Gadget.status);
        System.out.println();
        System.out.println("(status set to public for this project)");
    }
}