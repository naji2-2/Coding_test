class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int [numbers.length];        // numbers 배열과 같은 크기로 지정
        
        for(int i=0; i<numbers.length; i++){
            answer[i] += numbers[i]*2;                  // 2배 곱한 값을 answer 배열에 넣음
        }
        
        return answer;
    }
}