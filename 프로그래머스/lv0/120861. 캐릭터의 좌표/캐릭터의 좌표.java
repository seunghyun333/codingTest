// class Solution {
//     public int[] solution(String[] keyinput, int[] board) {
//         int[] answer = new int[2]; 
//         int first = 0; 
//         int second = 0;
            
//             for (int i = 0; i < keyinput.length; i++) {
//                 if(keyinput[i].equals("left")) {
//                     first = first - 1;
//                 }
//                 if(keyinput[i].equals("right")) {
//                     first = first + 1;
//                 }
//                 if(keyinput[i].equals("up")) {
//                     second = second + 1;
//                 }
//                 if(keyinput[i].equals("down")) {
//                     second = second - 1;
//                 }
//         }
        
        
//         if (first > board[0] / 2 ) {
//             first = board[0] / 2;
//         } else if(first < (board[0]/2) *-1) {
//             first = -board[0] / 2;
//         }
        
//         if (second > board[1] / 2 ) {
//             second = board[1] / 2;
//         } else if(second < (board[1]/2) * -1) {
//             second = -board[1] / 2;
//         }
        
//         answer[0] = first;
//         answer[1] = second;
        
//         return answer;
//     }
// }

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2]; 
        int posX = 0; 
        int posY = 0;
            
        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "left":
                    posX = Math.max(posX - 1, -board[0] / 2);
                    break;
                case "right":
                    posX = Math.min(posX + 1, board[0] / 2);
                    break;
                case "up":
                    posY = Math.min(posY + 1, board[1] / 2);
                    break;
                case "down":
                    posY = Math.max(posY - 1, -board[1] / 2);
                    break;
            }
        }

        answer[0] = posX;
        answer[1] = posY;
        
        return answer;
    }
}