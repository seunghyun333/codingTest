class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] arr = new int[n];
        int count = 0;
        
        for(int i = 0; i < n; i++) {
        arr[count] = num_list[i];
            count++;
        }
    return arr;
    }
}