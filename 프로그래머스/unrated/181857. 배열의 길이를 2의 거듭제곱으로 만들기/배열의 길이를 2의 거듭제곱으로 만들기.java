import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] arr) {
        while ((arr.length & (arr.length - 1)) != 0) {
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = 0;
        }
        return arr;
    }
}