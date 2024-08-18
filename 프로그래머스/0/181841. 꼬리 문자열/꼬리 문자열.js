function solution(str_list, ex) {
    var answer = '';
    
    for(var x of str_list){
        if(x.search(ex) > -1) continue;
        else answer += x;
    }
    
    return answer;
}