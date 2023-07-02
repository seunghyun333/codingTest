class Solution {
    public int solution(int hp) {
        int answer = 0;
        int cap = 0;
        int sol = 0;
        int work = 0;
        
        cap = hp / 5;
        sol = (hp - cap*5)/3;
        work = hp - (cap*5) - (sol*3);
        
        answer = cap + sol + work;
        return answer;
    }
}