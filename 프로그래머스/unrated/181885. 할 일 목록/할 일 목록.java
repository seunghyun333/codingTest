class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {

        int count = 0; 
        
        for (int i = 0; i < finished.length; i++){
            if (finished[i] == false){
                count++;
            }
        }
        
       String[] answer = new String[count];
        
        int array = 0;
        
        for (int i = 0; i < todo_list.length; i++){
            if(finished[i] == false){
                answer[array] = todo_list[i];
                array++;
            }
        }
        return answer;
    }
}