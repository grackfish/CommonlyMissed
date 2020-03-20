public class FourTwoC {
    public static void main() {
        int num = 12345;
        int sum = 0;
        while (num > 1) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}