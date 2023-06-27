public class Solution {
    public static int[] solution(int[] arr) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            length += arr[i];
        }

        int[] X = new int[length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i]; 
            for (int j = 0; j < num; j++) {
                X[index] = num;
                index++;
            }
        }

        return X;
    }
}