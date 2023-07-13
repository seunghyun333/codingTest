class Solution {
    public int[] solution(String myString) {
        String[] words = myString.split("x");
        int length = 0;
        
        if(myString.charAt(myString.length()-1) =='x') {
            length = words.length + 1;
        } else {
            length = words.length;
        }
        
        int[] answer = new int[length];
        
        for (int i = 0; i < words.length; i++) {
            answer[i] = words[i].length();
            if (words[i] == null) {
                answer[i] = 0;
            }
        }

        return answer;
    }
}