class Solution {
    public int solution(String my_string, String target) {
        
        // indexOf() 함수의 return 값이 -1보다 크면 문자열을 찾은 것
        if(my_string.indexOf(target)>-1){   
            return 1;
        }
        else
            return 0;
        
    }
}