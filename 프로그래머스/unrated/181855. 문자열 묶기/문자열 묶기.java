class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] index = new int[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            index[strArr[i].length()]++;
            }
        
        for (int i = 0; i < index.length; i++) {
            answer = Math.max(answer, index[i]);
        }
        
        return answer;
    }
}