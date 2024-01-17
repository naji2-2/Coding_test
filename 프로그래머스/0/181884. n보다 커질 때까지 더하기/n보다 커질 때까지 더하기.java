class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        int i = 0;        
        do{
            answer = answer + numbers[i];
            i++;
        }while(answer<=n);
        
        return answer;
    }
}