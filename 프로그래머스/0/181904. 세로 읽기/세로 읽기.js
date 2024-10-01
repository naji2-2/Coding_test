function solution(my_string, m, c) {
    var answer = '';
    
    s = my_string.split("");
    for(var i = c - 1; i < s.length; i += m){
        answer += s[i];
    }
    
    return answer;
}