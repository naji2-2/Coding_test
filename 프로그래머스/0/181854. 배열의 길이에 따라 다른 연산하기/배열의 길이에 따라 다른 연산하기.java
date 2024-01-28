class Solution {
    public int[] solution(int[] arr, int n) {
        
        int[] answer = new int[(arr.length)];
        
        if((arr.length-1)%2!=0){    // arr의 길이가 홀수라면
            for(int i=0; i<arr.length; i++){
                if((i+1)%2==0){     // 짝수 인덱스라면
                    answer[i] = arr[i] + n;
                }
                else{
                    answer[i] = arr[i];
                }
            }
        }
        
        if((arr.length-1)%2==0){    // arr의 길이가 짝수라면
            for(int i=0; i<arr.length; i++){
                if((i+1)%2!=0){     // 홀수 인덱스라면
                    answer[i] = arr[i] + n;
                }
                else{
                    answer[i] = arr[i];
                }
            }
        }
        
        return answer;
    }
}