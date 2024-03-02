class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        int num = 0;
        
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                
                 // 같은 방의 원소끼리 곱하지 않게 함
                if(i!=j){            
                    num = numbers[i] * numbers[j];
                    // 최대 값을 max에 넣음
                    if(num > max){              
                     max = num;
                    }
                }
                
            } // for j
        } //for i
        
        answer = max;
        
        return answer;
    }
}