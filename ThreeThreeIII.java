public class ThreeThreeIII {
    public static void main() {
        String weather;
        int temp = 60;
        if (temp <= 31) {
            weather = "cold";
        } else {
            weather = "cool";
        }
        if (temp >= 51) {
            weather = "moderate";
        } else {
            weather = "warm";
        }
        System.out.print(weather);
    }
}