class Solution {
    public int solution(int n, String control) {
        int answer = 0;
    
        
        char[] arr = control.toCharArray();             // control을 char형 배열로 변환
        
        for(int i=0; i<arr.length; i++){                
            if(arr[i]=='w'){                            // 'w' 인 경우
                n++;
            }
            else if(arr[i]=='s'){                       // 's' 인 경우
                n--;
            }
            else if(arr[i]=='d'){                       // 'd' 인 경우
                n += 10;
            }
            else if(arr[i]=='a'){                       // 'a' 인 경우
                n -= 10;
            } //if          
        } //for
        
        answer = n;                                     // 마지막 n 값을 answer에 대입
        
        return answer;
    }
}