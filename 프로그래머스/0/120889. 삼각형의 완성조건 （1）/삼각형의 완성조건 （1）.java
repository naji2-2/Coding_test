class Solution {
    public int solution(int[] sides) {
        int answer = 1, max = 0, sum = 0;
        
        // 세 변 길이의 합 구하기
        for(int i=0; i<sides.length; i++){
            sum += sides[i];
        }
        
        // 최대값 구하기
        if(sides[0] > sides[1]){
            max = sides[0];
        }
        else{
            max = sides[1]; 
        }
        
        if(sides[2] > max)
            max = sides[2];
        
        // 완성조건 판별하기
        if((sum-max) <= max)
            answer = 2;
        
        return answer;
    }
}