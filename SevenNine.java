import java.util.ArrayList;
public class SevenNine {
    public static void main() {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        arrList.add("D");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.remove(i));
        }
    }
}