import java.util.ArrayList;
public class SevenEight {
    public static void main() {
        ArrayList<String> words = new ArrayList<String>();
        words.add("mat");
        words.add("new");
        words.add("open");
        words.add("pet");
        int i = 0;
        while (i < words.size()) {
            words.remove(i);
            i++;
        }
        System.out.println(words.toString());
    }
}