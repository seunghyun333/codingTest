class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int a = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                a++;
            }
            answer = a;
        }
        return answer;
    }
}