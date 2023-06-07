class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if(number % n % m == answer && number % m % n == answer && number % n == answer && number % m == answer) 
        { return 1;} 
        else { return 0;
        }
    }
}