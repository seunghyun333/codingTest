class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length + 4) / 5];
        int count = 0;
        for(int i = 0; i < 30; i=i+5) {
            answer[count] = names[i];
            count++;  
              if (count >= answer.length) {
                break;
            }
        }
        return answer;
    }
}