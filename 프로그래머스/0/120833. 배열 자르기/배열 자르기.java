class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
       
        int length = 0;
        int num = 0;
        
        // answer배열의 방 길이를 구하기 위한 for문
        for(int i=num1; i<=num2; i++){
            length++;
        }
        
        // answer 배열 선언&생성
        int[] answer = new int[length];
        
        // answer배열에 numbers의 num1번째부터 num2번째까지 값을 넣는 for문
        for(int i=num1; i<=num2; i++){
            answer[num] = numbers[i];
            num++;
        }
        
        return answer;
    }
}