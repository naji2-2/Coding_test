function solution(strArr) {
    var answer = [];
    
    strArr.forEach((v, i, arr)=> i%2==1 ? v = answer.push(v.toUpperCase()) : answer.push(v.toLowerCase()));
    
    return answer;
}