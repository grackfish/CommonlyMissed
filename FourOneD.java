public class FourOneD {
    public static void main() {
        //Correct answer because x starts with 100 and decreases by 10 with
        //the last answer being 10.
        
        int x = 100;
        int total = 0;
        while(x >= 10) {
            total = total + x;
            x = x - 10;
        }
    }
}