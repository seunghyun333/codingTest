import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        char[] digits = str.toCharArray();
        Arrays.sort(digits);

        for (int left = 0, right = digits.length - 1; left < right; left++, right--) {
            char temp = digits[left];
            digits[left] = digits[right];
            digits[right] = temp;
        }

        str = new String(digits);

        return Long.parseLong(str);
    }
}