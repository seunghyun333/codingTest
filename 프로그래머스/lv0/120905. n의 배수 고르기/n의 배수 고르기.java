class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[numlist.length];
        int j = 0;
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[j] = numlist[i];
                j++;
            } 
            if(numlist[i] == 0) {
                   answer[j] = numlist[i];
                j++;
            }
        }
            
            int[] result = new int[j];
            for (int i = 0; i < j; i++) {
            result[i] = answer[i];
        }
            
        
            
        return result;
    }
}