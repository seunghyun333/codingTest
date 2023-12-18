class Solution {
    public int[] solution(int n) {
        int nn = n;
        int count = 0;
        
         while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }
        
        int[] answer = new int[count + 1];
        n = nn; 
        
        for (int i = 0; i <= count; i++) {
            answer[i] = n;
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        
        
        return answer;
    }
}