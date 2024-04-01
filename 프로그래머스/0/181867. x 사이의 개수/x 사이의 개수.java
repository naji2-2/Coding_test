class Solution {
    public int[] solution(String myString) {
        
        int temp = 0;
        String o[] = myString.split("x",-1);    // "x"를 기준으로 문자열을 나눔
        
        int[] answer = new int[(o.length)];
            
        for(int i=0; i<answer.length; i++){
            temp = o[i].length();               // length()로 문자열의 길이를 구함
            answer[i] += temp;                  // 문자열의 길이를 answer에 넣음
        }
        
        return answer;
    }
}