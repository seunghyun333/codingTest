class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int first = 0;
        int second = 0;
        
        for(int i = 0; i < num_list.length; i=i+2) {
            first = first + num_list[i];
        }
        
        for(int i = 1; i < num_list.length; i=i+2) {
            second = second + num_list[i];
        }        
        if(first > second){
            answer = first;
        } else {
            answer = second;
        }
        return answer;
    }
}