function solution(arr) {
    var answer = [];
    
    for(x of arr){
        for(var i=0; i<x; i++)
            answer.push(x)
    }
    
    return answer;
}