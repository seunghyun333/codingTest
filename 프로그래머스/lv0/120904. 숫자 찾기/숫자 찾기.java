class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int length = String.valueOf(num).length();
        int[] arr = new int[length];

        for(int i = length -1 ; i >= 0 ; i--){
            arr[i] = num % 10;
            num /=10;
        }
        
        for(int i = 0; i < length; i++) {
            if(arr[i] == k) {
                answer = i+1;
                break;
            } 
        }
        if(answer == 0) {
            answer = -1;
        }
        
        return answer;
    }
}