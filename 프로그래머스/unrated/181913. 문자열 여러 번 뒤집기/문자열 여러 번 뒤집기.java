class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray();
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            
            // 문자열의 일부를 뒤집습니다.
            reverseSubstring(charArray, start, end);
        }
        
        return new String(charArray);
    }
    
    private void reverseSubstring(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}