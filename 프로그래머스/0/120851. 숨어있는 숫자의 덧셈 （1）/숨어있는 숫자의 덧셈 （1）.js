function solution(my_string) {
    var answer = 0;
    var patt = /^\d?[1-9]/;
    
    for(x of my_string){
        if(x.match(patt))
           answer += Number(x);
    }
    
    return answer;
}