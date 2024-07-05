function solution(a, d, included) {
    var answer = 0;
    
    for(x in included){
        if(included[x]==true)
            answer += a+x*d;
    }
    
    return answer;
}