class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        for(int i=1; i<=(n/slice); i++){
            answer++;
        }
        if((n%slice)!=0){
            answer++;
        }
        
        return answer;
    }
}