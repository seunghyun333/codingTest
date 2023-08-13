class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for (int i = 0; i < dic.length; i++) {
            boolean allLettersUsed = true;
            for (int j = 0; j < spell.length; j++) {
                if (!dic[i].contains(spell[j])) {
                    allLettersUsed = false;
                    break; 
                }
            }
            if (allLettersUsed) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}