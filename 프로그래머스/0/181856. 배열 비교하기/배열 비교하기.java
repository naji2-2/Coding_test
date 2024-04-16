class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int ar1 = 0;
        int ar2 = 0;
        
        if((arr1.length)>(arr2.length)){        // arr1의 길이가 더 긴 경우
            answer = 1;
        }
        else if((arr1.length)==(arr2.length)){  // 두 배열의 길이가 같은 경우
            for(int i=0; i<arr1.length; i++){
                ar1 += arr1[i];
                ar2 += arr2[i];
            }
            if(ar1>ar2)                        // 길이가 같은 두 배열의 원소 합 비교
                answer = 1;
            else if(ar1==ar2)
                answer = 0;           
            else
                answer = -1;
        }
        else                                   // arr2의 길이가 더 긴 경우
            answer = -1;
        
        
        return answer;
    }
            
}