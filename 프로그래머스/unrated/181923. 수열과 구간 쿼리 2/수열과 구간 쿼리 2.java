import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int[] arr2 = arr; 
        
        for (int i = 0; i < queries.length; i++) {
            int first = queries[i][0];
            int second = queries[i][1];
            int count = 0;
            
            
            int[] temp = new int[second-first+1];
            for(int j = first; j < second+1; j++) {
                temp[count] = arr2[j];
                count++;
            }
            
            Arrays.sort(temp);
            
            for (int k = 0; k < temp.length; k++) {
                if(temp[k] > queries[i][2]) {
                    answer[i] = temp[k];
                    break;
             } else {
                    answer[i] = -1;
                }
            }
        }
        
        
        
        
        return answer;
    }
}