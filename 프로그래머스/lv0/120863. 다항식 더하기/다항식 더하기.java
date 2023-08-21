class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] terms = polynomial.split("\\+");
        
        int x = 0;
        int g = 0;
        
        for (int i = 0; i < terms.length; i++) {
            String term = terms[i].trim();
            
            if (term.equals("x")) {
                x += 1;
            } else if (term.contains("x")) {
                int coefficient = 0;
                
                if (term.startsWith("-x")) {
                    coefficient = -1;
                } else {
                    coefficient = Integer.parseInt(term.substring(0, term.indexOf("x")));
                }
                
                x += coefficient;
            } else if (!term.equals("")) {
                g += Integer.parseInt(term);
            }
        }
        
        if (x != 0) {
            if(x ==  1) {
                answer += "x";
            } else {
            answer += x + "x";
            }
        }
        
        if (g != 0) {
            if (x != 0) {
                answer += " + ";
            }
            answer += g;
        }
        
        return answer;
    }
}