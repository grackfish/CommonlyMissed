public class SixThree {
    public static int checkString(String[] arr){
        int count = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k].length() >= 3) {
                count++;
            }
        }
        return count;
    }
}