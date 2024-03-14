class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int temp = 0;
        
        //버블 정렬
        for(int i=0; i<(num_list.length-1); i++){
            for(int j=0; j<(num_list.length - 1) -i; j++){
                if(num_list[j] > num_list[j+1]){
                    temp = num_list[j];
                    num_list[j] = num_list[j+1];
                    num_list[j+1] = temp;
                }
            } // for 2
        } // for1
        
        for(int i=0; i<answer.length; i++){
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}