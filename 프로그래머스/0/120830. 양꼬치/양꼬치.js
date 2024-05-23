function solution(n, k) {
    var answer = 0;
    
    if(Math.trunc(n/1)>0){
        answer = (12000*n + 2000*k) - (2000*Math.trunc(n/10))
    }
    else
        answer = (12000*n + 2000*k)
    
    return answer;
}