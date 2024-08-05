function solution(my_string, n) {
    var answer = '';
    
    for(x in my_string){
        if(x >= my_string.length-n){
            answer += my_string[x];
        }
    }
    
    return answer;
}