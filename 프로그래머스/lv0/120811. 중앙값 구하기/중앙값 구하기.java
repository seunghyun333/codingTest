import java.util.Arrays;


class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int length = array.length;
        int middle = 0;
        Arrays.sort(array);
        
        
        middle = length / 2;
        answer = array[middle];
        return answer;
    }
}