class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        
        // 정수형을 문자열로 변환
        String A = String.valueOf(a);
        A += String.valueOf(b);
        //문자열을 정수형으로 변환
        num1 = Integer.valueOf(A);
        
        num2 += a*b*2;
        
        if(num1>num2){
            answer += num1;
        }
        else{
            answer += num2;
        }
        
        return answer;
    }
}