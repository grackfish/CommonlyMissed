public class SixThreeOne {
    public static void main() {
        //I: Doesn't compile
        checkString(new String[]);
        
        //II: Compiles
        checkString(new String[0]);
        
        //III: Compiles
        String[] str = {"cat", "dog"};
        checkString(str);
    }
}