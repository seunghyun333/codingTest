class Solution {
    public String[] solution(String my_string) {
        
        my_string = my_string.trim(); //맨 앞과 맨 뒤 공백 제거
        
        String[] answer = my_string.split(" ");
        int count = 0;
            for(int i = 0; i < answer.length; i++){
             if(!answer[i].isEmpty()) {
                count++; }
        }
        
        
        String[] answer1 = new String[count];
        int ar = 0;
        

        for(int i = 0; i < answer.length; i++) {
        if(!answer[i].isEmpty()){
            answer1[ar]= answer[i];
            ar++;
        }
        }
        

        return answer1;
    }
}