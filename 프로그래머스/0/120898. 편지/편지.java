class Solution {
    public int solution(String message) {
        int answer = 0;
        
        char[] array = message.toCharArray();
        
        answer = 2*(array.length);
        
        return answer;
    }
}