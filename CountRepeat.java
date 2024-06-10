package Array;

public class CountRepeat {
    private static int countRepeat(int[] arr, int x) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 3, 4, 5, 7, 7, 7, 7 };
        int x = 7;
        System.out.println(countRepeat(arr, x));
    }
// to do
}