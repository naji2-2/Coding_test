function solution(n, k) {
    var answer = [];
    
    for(var x=k; x<=n; x=x+k){
        answer.push(x);
    }
    
    return answer;
}