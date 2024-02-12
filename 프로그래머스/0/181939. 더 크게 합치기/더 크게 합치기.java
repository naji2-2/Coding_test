class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String numA = "";
        String numB = "";
        
        String.valueOf(a);
        String.valueOf(b);     
        
        numA += a;
        numA += b;
        
        numB += b;
        numB += a;
        
        a = Integer.valueOf(numA);
        b = Integer.valueOf(numB);
        
        if(a>b){
            answer = a;
        }
        else{
            answer = b;
        }
        
        return answer;
    }
}