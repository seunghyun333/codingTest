import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder small = new StringBuilder();
        StringBuilder big = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                small.append(c);
            } else {
                big.append(c);
            }
        }

        char[] smallArray = small.toString().toCharArray();
        char[] bigArray = big.toString().toCharArray();

        Arrays.sort(smallArray);
        Arrays.sort(bigArray);

        return new String(reverseArray(smallArray)) + new String(reverseArray(bigArray));
    }

    private char[] reverseArray(char[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}