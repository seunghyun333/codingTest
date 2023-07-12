class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2)+Integer.parseInt(bin2, 2));
        //두 번째 매개변수로 2를 전달하여 2진법으로 변환,
        //Integer.parseInt(bin1, 2)의 호출 결과는 bin1의 이진수 문자열을 10진수로 변환한 값입니다.
    }
}