class Solution {
    public int solution(int hp) {
        int answer = 0;
        
       answer += (hp/5);       // 장군개미
        hp -= (hp/5)*5;
        
        if(hp/3!=0){
            answer += (hp/3);   // 병정개미
            hp -= (hp/3)*3;
        }
        if(hp!=0)
            answer += hp;       // 일개미
        
        return answer;
    }
}