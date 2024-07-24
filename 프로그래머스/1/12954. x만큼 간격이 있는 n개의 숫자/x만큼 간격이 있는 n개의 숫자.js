function solution(x, n) {
    var answer = [];
    
    for(var i=1; i<=n; i++){
        answer.push(x+(i-1)*x)
    }
    
    return answer;
}