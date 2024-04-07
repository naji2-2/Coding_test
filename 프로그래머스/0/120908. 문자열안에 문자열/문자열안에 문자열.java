class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        // 특정 문자열을 못 찾은 경우 -1을 return함
        if(str1.indexOf(str2)>-1){
            answer += 1;
        }
        else{
            answer += 2;
        }
        
        return answer;
    }
}