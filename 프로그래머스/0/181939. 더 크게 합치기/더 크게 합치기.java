class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String numA = "";
        String numB = "";
        
        String.valueOf(a);              // 문자열로 변환
        String.valueOf(b);     
        
        numA += a;
        numA += b;
        
        numB += b;
        numB += a;
        
        a = Integer.valueOf(numA);      // 정수형으로 변환
        b = Integer.valueOf(numB);
        
        if(a>b){                        // 크기비교
            answer = a;
        }
        else{
            answer = b;
        }
        
        return answer;
    }
}