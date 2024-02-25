class Solution {
    public int[] solution(int[] num_list) {
        
        // num_list와 같은 크기로 크기 지정
        int[] answer = new int[num_list.length];                
        
         // num_list 배열의 마지막 방부터 0번째 방까지
        for(int i=(num_list.length-1); i>=0; i--){   
            // answer 배열의 0번째 방부터 값이 채워짐
            answer[(num_list.length-1)-i] += num_list[i];
        }
        
        return answer;
    }
}