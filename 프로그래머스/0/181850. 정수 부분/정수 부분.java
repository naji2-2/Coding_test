class Solution {
    public int solution(double flo) {
        int answer = 0;
        
        if(flo/100!=0){                 // 100의 자리 정수 부분 구하기
            answer += 100 * (flo/100);
        }
        else if(flo/10!=0){             // 10의 자리 정수 부분 구하기
            answer += 10 * (flo/10);
        }
        else if(flo/1!=0){              // 1의 자리 정수 부분 구하기
            answer += 1 * (flo/1); 
        }
       
        
        return answer;
    }
}