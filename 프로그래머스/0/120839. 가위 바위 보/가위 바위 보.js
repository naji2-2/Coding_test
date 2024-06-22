function solution(rsp) {
    var answer = '';
    var a = rsp.split('');
    
    for(var x of a){
        if(x==='0') answer += '5';
        else if(x==='2') answer += '0';
        else answer += '2';
    }
    
    return answer;
}