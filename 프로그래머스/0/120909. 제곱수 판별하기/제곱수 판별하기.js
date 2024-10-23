function solution(n) {
    var answer = 2;
    
    for(var i = 0; i < n; i++){
        if(i*i === n){
            console.log(i*i);
            answer = 1;
            break;
        }    
    }
    
    return answer;
}