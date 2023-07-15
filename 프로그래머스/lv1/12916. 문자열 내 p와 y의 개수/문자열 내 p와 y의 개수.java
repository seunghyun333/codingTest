class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'p') {
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }
        }
        
        return (pCount == yCount);
    }
}