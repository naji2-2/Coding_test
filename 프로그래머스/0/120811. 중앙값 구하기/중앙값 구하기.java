import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);                // 배열정렬
        return array[array.length/2];      // 중앙 값 출력
    }
}