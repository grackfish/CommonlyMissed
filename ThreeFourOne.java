public class ThreeFourOne {
    public static void main() {
        int x = 5;
        int y = 10;
        int result = 0;
        if (x > y) {
            result = x - y;
            System.out.print(result);
        } else if (x < y) {
            result = y - x;
            System.out.print(result);
        }
        
        if (x < y) {
            System.out.print(y = x);
        } else {
            System.out.print(x - y);
        }
    }
}