import java.util.ArrayList;
public class SevenSix {
    public static void main() {
        ArrayList<Integer> vals = new ArrayList<Integer>();

        vals.add(vals.size(), vals.size());

        vals.add(vals.size() - 1, vals.size() + 1);

        vals.add(vals.size() - 2, vals.size() + 2);

        System.out.println(vals.toString());
    }
}