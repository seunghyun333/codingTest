import java.util.*;


class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        
        for (int i = factors.size()-1; i >= 1; i--) {
            if(factors.get(i) == factors.get(i-1)) {
                factors.remove(i);
            }
        }
        
        int[] answer = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            answer[i] = factors.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}