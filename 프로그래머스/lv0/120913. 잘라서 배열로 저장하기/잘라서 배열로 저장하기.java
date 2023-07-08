class Solution {
    public String[] solution(String my_str, int n) {
        int number = 0;

        
        if(my_str.length() % n == 0) {
            number = my_str.length() / n;
        } else {
            number = (my_str.length() / n)+1;
        }
        
        int count = 0;
        
        String[] answer = new String[number];
        
       for (int i = 0; i < my_str.length(); i += n) {
            int endIndex = Math.min(i + n, my_str.length());
            answer[count] = my_str.substring(i, endIndex);
            count++;
        }
        
        return answer;
    }
}