class Solution {
    public int solution(int order) {
        int answer = 0;
        int length = String.valueOf(order).length();
        int[] array = new int[length];
        int count = 0;
        
        for(int i = 0; i < length; i++){
            array[i] = order % 10;
            order /= 10;
 
            if(array[i] == 3 || array[i] == 6 || array[i] == 9) {
                count ++;
            }
        }
        answer = count;
        return answer;
        }
    }


