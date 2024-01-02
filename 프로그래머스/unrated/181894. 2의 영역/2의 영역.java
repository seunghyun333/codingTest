class Solution {
    public int[] solution(int[] arr) {

        int first = -1; 
        int second = -1;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                first = i;
                break;
            }
        }
        
         if (first == -1) { 
            return new int[]{-1};
        }
        
        for(int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == 2) {
                second = i;
                break;
            }
        }
        
        int length = second - first +1;
        int[] answer = new int[length];
        
        if(first == second) {
            answer[0] = arr[first];
            return answer;
        }
        
         for (int i = first, j = 0; i < second + 1; i++, j++) {
            answer[j] = arr[i];
        }
        
        return answer;
    }
}