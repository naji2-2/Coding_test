import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;   
        
        Arrays.sort(array);                         // 배열정렬
        return answer = array[array.length/2];      // 중앙 값 출력
    }
}