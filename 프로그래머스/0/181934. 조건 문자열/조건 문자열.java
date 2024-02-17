class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        switch(eq){
            case "=" :                          //eq가 "=" 일 때
                if (ineq.equals("<")){              //ineq가 "<" 인 경우
                    if(n<=m){             
                        answer = 1;
                        break;
                    }
                }
                else if(ineq.equals(">")){          //ineq가 ">" 인 경우
                    if(n>=m){
                        answer = 1;
                        break;
                    }
                }
            case "!" :                          //eq가 "!" 일 때
                    if (ineq.equals("<")){          //ineq가 "<" 인 경우
                    if(n<m){
                        answer = 1;
                        break;
                    }
                }
                else if(ineq.equals(">")){          //ineq가 ">" 인 경우
                    if(n>m){
                        answer = 1;
                        break;
                    }
                }
        }//switch
                    
        return answer;
        
    }
}