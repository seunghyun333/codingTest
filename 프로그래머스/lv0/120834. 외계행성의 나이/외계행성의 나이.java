class Solution {
    public String solution(int age) {
        String answer = "";
        String[] new_age = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        
        if(age == 1000) {
        a = 1;
        answer += new_age[a] + "";
        b = 0;
        answer += new_age[b] + "";
        c = 0;
        answer += new_age[c] + "";
        d = 0;
        answer += new_age[d] + "";
        } else if (age == 100) {
         a = 1;
         answer += new_age[a] + "";
        b = 0;
        answer += new_age[b] + "";
        c = 0;
        answer += new_age[c] + "";
        }
        else if(age == 10) {
        b = 1;
        answer += new_age[b]+"";
        c = 0;
        answer += new_age[c]+"";
        }
        else if(age == 0){
        c = 0;
        answer += new_age[c]+"";
        }
        else if (age >=100 && age < 1000) {
         a = age/100;
         answer += new_age[a] + "";
        b = (age-(a*100)) / 10;
        answer += new_age[b] + "";
        c = age - (a*100) - (b*10);
        answer += new_age[c] + "";
        } 
        else if(age < 100 && 10 < age) {
        b = age / 10;
        answer += new_age[b]+"";
        c = age - (b*10);
        answer += new_age[c]+"";
        }
        else if(10 > age && age >0) {
        c = age;
        answer += new_age[c]+"";
        }
        
        
        return answer;
    }
}