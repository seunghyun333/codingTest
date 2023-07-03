class Solution {
    public int solution(String binomial) {
        int answer = 0;

        String[] tokens = binomial.split(" "); // 공백을 기준으로 이항식을 토큰으로 분리
        int a = Integer.parseInt(tokens[0]); // 첫 번째 숫자
        String operator = tokens[1]; // 연산자
        int b = Integer.parseInt(tokens[2]); // 두 번째 숫자
        
        if(tokens[1].equals("+")){
            answer = a + b;
        } else if (tokens[1].equals("-")) {
            answer = a - b;
        } else if (tokens[1].equals("*")) {
            answer = a * b;
        }
        return answer;
    }
}