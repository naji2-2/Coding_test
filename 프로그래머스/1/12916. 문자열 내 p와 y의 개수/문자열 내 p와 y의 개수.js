function solution(s){
    var answer = false;
    var p = 0, y = 0;

    for(x of s){
        if(x.toLowerCase() === "p") p++;
        else if(x.toLowerCase() === "y") y++;
    }
    
    if(p == y) answer = true

    return answer;
}