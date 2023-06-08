class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder dd = new StringBuilder();
        StringBuilder ss = new StringBuilder();
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0){
                int c = num_list[i];
                dd.append(c);
            } else {
                int d = num_list[i];
                ss.append(d);
            }
        }
            int ddValue = Integer.parseInt(dd.toString());
            int ssValue = Integer.parseInt(ss.toString());
            answer = ddValue + ssValue;
            return answer;
    } 
}