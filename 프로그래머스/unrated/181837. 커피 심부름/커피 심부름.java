class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        int a = 4500;
        int b = 5000;
        
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("americano") || order[i].contains("anything")) {
                answer += a;
            } else if (order[i].contains("latte")) {
                answer += b;
            }
        }
        
        return answer;
    }
}