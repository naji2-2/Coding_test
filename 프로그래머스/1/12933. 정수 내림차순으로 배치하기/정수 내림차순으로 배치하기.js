function solution(n) {
    var answer = 0;
    
    n = n.toString();
    n = n.split('');
    n = n.sort();
    n = n.reverse();
    answer = Number(n.join(""));
    return answer;
    
}