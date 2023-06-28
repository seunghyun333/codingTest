class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length != arr2.length){
            if(arr2.length > arr1.length){
                answer = -1;
            } else if(arr2.length < arr1.length){
                answer =1;
            } else {
                answer = 0; 
            } 
        } else if (arr1.length == arr2.length) {
            int arr11 = 0;
            int arr22 = 0;
            for (int i = 0; i < arr1.length; i++){
                arr11 += arr1[i];
            }
            for (int i = 0; i < arr2.length; i++){
                arr22 += arr2[i];
            }
            if (arr11 > arr22){
                answer = 1;
            } else if (arr11 < arr22){
                answer = -1;
            } else {
                answer =0;
            }
        }
        return answer;
    }
}