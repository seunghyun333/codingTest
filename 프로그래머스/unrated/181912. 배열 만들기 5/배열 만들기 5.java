class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = new int[intStrs.length];
        String result = "";
        
        for (int i = 0; i < intStrs.length; i++) {
            answer[i] = Integer.parseInt(String.valueOf(intStrs[i].substring(s,s+l)));
            if (answer[i] > k) {
                result += String.valueOf(answer[i]);
                result +=" ";
            }
        }
        
         String[] result1 = result.split(" ");
         int[] result2 = new int[result1.length];
            for(int i = 0; i < result1.length; i++) {
                result2[i] = Integer.parseInt(result1[i]);
            }
        
        return result2;
    }
}