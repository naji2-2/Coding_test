class Solution {
    public int[] solution(String[] strlist) {
        
        //strlist와 amswer의 배열을 같은 길이로 지정
        int[] answer = new int[strlist.length];                 
        
        for(int i=0; i<strlist.length; i++){
            // 한 원소를 char형 형태로 배열에 넣음
            char[] spelling = strlist[i].toCharArray();      
            // answer 배열에 원소의 길이를 넣음
            answer[i] = spelling.length;                        
        }
        
        return answer;
    }
}