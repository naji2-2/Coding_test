class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] arr = my_string.toCharArray();          // 문자열을 char형 배열로 만들기
        
        for(int i = (arr.length-1); i>=0; i--){
            answer += String.valueOf(arr[i]);
        }
        
        return answer;
    }
}