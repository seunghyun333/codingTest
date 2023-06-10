class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length];
        int first = 0;
        
        
        for (int i = 0; i < num_list.length; i++) {
            first = num_list[num_list.length-(1+i)];
            answer[i] = first;
        }    
        return answer;
    }
}