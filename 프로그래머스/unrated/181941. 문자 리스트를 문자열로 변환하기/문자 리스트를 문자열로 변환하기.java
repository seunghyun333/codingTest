class Solution {
    public String solution(String[] arr) {
        
        int length = arr.length;
        StringBuilder sb = new StringBuilder();

        
        for (int i = 0; i < length; i++) {
            sb.append(arr[i]);
        
        } 
        return sb.toString();
    }
}