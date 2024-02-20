class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd_str = "";
        String even_str = "";
        
        for(int i=0; i<num_list.length; i++){
            if((num_list[i]%2)==0){
                even_str += String.valueOf(num_list[i]);        // 짝수를 이어 붙임
            }
            else{
                odd_str += String.valueOf(num_list[i]);         // 홀수를 이어 붙임
            }               
        }
        
        answer += (Integer.valueOf(odd_str) + Integer.valueOf(even_str));
        
        return answer;
    }
}