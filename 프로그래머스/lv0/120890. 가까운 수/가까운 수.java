import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        
         if (n < array[0]) {
            answer = array[0];
        } else if (n > array[array.length-1]){
            answer = array[array.length-1];
        } else if (Arrays.binarySearch(array, n) >= 0) {
            answer = n;
        } else {
        for (int i = 0; i < array.length-1; i++) {
            if ((n > array[i]) && (n < array[i+1])) {
                if((n - array[i]) > (array[i+1] - n)) {
                answer = array[i+1];
                } else {
                    answer = array[i];
                }
            }
        }
        }
        
        return answer;
    }
}