class Solution {
    public String solution(String my_string, String overwrite_string, int s) {

        char[] charArray1 = my_string.toCharArray();
        char[] charArray2 = overwrite_string.toCharArray();
        int length1 = my_string.length();
        int length2 = overwrite_string.length();
        
        
       StringBuilder sb = new StringBuilder(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        
        
        return sb.toString();
    } 
}