import java.util.ArrayList;
public class SevenThree {
    public static void main() {
        //A
        ArrayList arrList() = new ArrayList<String>();
        
        //B (wrong because must have <>)
        ArrayList arrList = new ArrayList<String>();
        
        //C
        ArrayList<> arrList = new ArrayList<String>();
        
        //D
        ArrayList arrList<String> = new ArrayList<String>();
        
        //E
        ArrayList<String> arrList = new ArrayList<String>();
    }
}
