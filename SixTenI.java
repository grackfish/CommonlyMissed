public class SixTenI {
    public static void main() {
        //ArayIndexOutOfBoundsException
        int[] arr = {1, 2, 3, 4, 5};
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x + 3]);
        }
    }
}