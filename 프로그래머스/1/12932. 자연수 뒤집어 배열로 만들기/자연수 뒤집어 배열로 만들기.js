function solution(n) {
    var answer = [];
    var a = []
    
    n = n.toString()
    
    for(var x of n) {
        console.log(x);
        a.push(Number(x));   
    }
    
    for(var i=0; i < n.length; i++) {
        answer.push(a.pop())
    }
        
    return answer;
}