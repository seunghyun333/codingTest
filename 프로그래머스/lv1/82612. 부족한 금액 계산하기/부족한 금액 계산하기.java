class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long fprice = 0;
        
        for(int i = 1; i < count+1; i++) {
            fprice += (long) price * i;
        }
        
        if(fprice - money  > 0) {
            answer =  fprice - (long) money;
        } else {
            answer = 0;
        }
        
        

        return answer;
    }
}