function solution(num_list, n) {
    var answer = [];
    
    num_list.forEach((v, i, arr) => i%n==0 ? answer.push(v):0)
    
    return answer;
}