import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        // n 번째 원소 이후의 원소들을 answer 배열의 앞부분에 복사
        System.arraycopy(num_list, n, answer, 0, num_list.length - n);
        
        // n 번째까지의 원소들을 answer 배열의 뒷부분에 복사
        System.arraycopy(num_list, 0, answer, num_list.length - n, n);
        
        return answer;
    }
}