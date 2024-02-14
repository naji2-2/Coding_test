class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int j = 0;
        
        // 문자열을 배열로 변환
        String[] mylist =  my_string.split("");
        String[] overlist = overwrite_string.split("");
        
        //값 넣기
        for(int i=0; i<mylist.length; i++){
            if(i==s){
                for(int k=j; j<overlist.length; j++){
                    answer += overlist[j];
                } //for2 
                i += j;
            } //if
            if(i>=mylist.length){
                break;
            }
            else{
                answer += mylist[i];
            }
            
        }//for1
        
        return answer;
    }
}