function solution(s) {
    var answer = '';
    
    answer = s.split(" ").map(a => parseInt(a));

    answer = Math.min(...answer) + " " + Math.max(...answer)
    
    return answer;
}