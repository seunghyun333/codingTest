class Solution {
    public String solution(String str1, String str2) {
        

        char [] str11 = str1.toCharArray();
        char [] str22 = str2.toCharArray();
        StringBuilder result = new StringBuilder();
        int length1 = str1.length();
        
        for (int i =0; i < length1; i++) {
            result.append(str11[i]).append(str22[i]);
        }

        return result.toString();
    }
}