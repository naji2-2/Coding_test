function solution(my_string, index_list) {
    var answer = '';
    
    for(x of index_list){
        answer += my_string.charAt(x);
    }
    
    
    return answer;
}