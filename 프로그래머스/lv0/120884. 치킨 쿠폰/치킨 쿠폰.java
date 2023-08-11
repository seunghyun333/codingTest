class Solution {
    public int solution(int chicken) {
        int total = 0;
        int coupon = chicken;
        
        while (coupon >= 10){
            int newchic = coupon / 10;
            total = total + newchic;
            coupon = newchic + (coupon % 10);
        }

        return total;
    }
}