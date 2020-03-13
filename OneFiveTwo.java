public class OneFiveTwo {
    //run this main class
    public static void main() {
        choiceA();
        choiceB();
        choiceC();
        choiceD();
        choiceE();
    }
    
    //Choice A: There are no errors and the code works as intended.
    public static void choiceA() {
        double fact1 = 1 / 2;
        double fact2 = 3 * 4;
        double product = fact1 * fact2;
        System.out.println("Choice A:");
        System.out.println(product);
        System.out.println();
    }
    
    //Either the numerator or the denominator of the fraction 1 / 2 should be cast as double.
    public static void choiceB(){
        double fact1 = (double)1 / 2;
        double fact2 = 3 * 4;
        double fact3 = 1 / (double)2;
        double product1 = fact1 * fact2;
        double product2 = fact3 * fact2;
        System.out.println("Choice B:");
        System.out.println("If numerator is cast as double: " + product1);  
        System.out.println("If denominator is cast as double: " + product1);
        System.out.println();
    }
    
    //The expression fact1 * fact2 should be cast as double.
    public static void choiceC(){
        double fact1 = 1 / 2;
        double fact2 = 3 * 4;
        double product = (double)(fact1 * fact2);
        System.out.println("Choice C:");
        System.out.println(product);
        System.out.println();
    }
    
    //The expressions 1 / 2 and 3 * 4 should both be cast as double.
    public static void choiceD() {
        double fact1 = (double)(1 / 2);
        double fact2 = (double)(3 * 4);
        double product = fact1 * fact2;
        System.out.println("Choice D:");
        System.out.println(product);
        System.out.println();
    }
    
    //The variables fact1 and fact2 should both be declared as int.
    public static void choiceE() {
        double fact1 = 1 / 2;
        double fact2 = 3 * 4;
        double product = (int)fact1 * (int)fact2;
        System.out.println("Choice E:");
        System.out.println(product);
    }
}
