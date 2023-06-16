class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] pizza = new int[100];
        
        for (int i = 1; i < 100; i++) {
            pizza[i] = 6 * i;
        }
        
        for (int i = 0; i < 100; i++) {
            for (int k = 1; k < 100; k++) {
            if(pizza[i] == n * k) {
                answer = i;
                break;
            }
        }   
            if(answer != 0) {
                break;
            }
        

       
    }return answer; 
}}