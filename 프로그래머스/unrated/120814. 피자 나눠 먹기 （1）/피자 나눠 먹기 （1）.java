class Solution {
    public int solution(int n) {
        
        int answer = 0;
        
        for(int i=0; i<(n/7); i++){
            answer++;
        }
        if(n%7!=0){
            answer++;
        }
        
        return answer;
        
    }
}