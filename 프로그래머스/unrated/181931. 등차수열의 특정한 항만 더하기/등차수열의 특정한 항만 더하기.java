class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] arr = new int[included.length];
        
        for (int i = 0; i < included.length; i++){
            if (included[i]) {
                arr[i] = a + (i * d);
                answer += arr[i];
            }
        }

        

        return answer;
        
    }
}