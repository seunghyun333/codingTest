class Solution {
    public int[] solution(int[] arr, int[] delete_list) {

        int count = 0;
        int twice = 0;
        
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j<delete_list.length; j++){
            if(arr[i] == delete_list[j]){
                twice++;
            } 
          }
        }
        
         int[] answer = new int[arr.length - twice];
         int count1 = 0;
        
        for (int i = 0; i < arr.length; i++){
            boolean found = false;
            for(int j =0; j < delete_list.length; j++) {
            if(arr[i] == delete_list[j]){
                found = true;
                break;
            } 
        }
            if(!found){
                answer[count1] = arr[i];
                count1++;
            }
        }

        return answer;
    }
}