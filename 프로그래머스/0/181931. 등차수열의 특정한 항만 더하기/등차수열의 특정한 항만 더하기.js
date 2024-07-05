function solution(a, d, included) {
    var answer = 0;
    
    included.forEach((v,i,arry) => answer += v? a+i*d : 0)
    
    return answer;
}