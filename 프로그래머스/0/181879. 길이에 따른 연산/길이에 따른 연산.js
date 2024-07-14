function solution(num_list) {
    var answer = 0;
    var sum = 1;
    
    for(x of num_list){
        if(num_list.length<=10){
            sum *= x;
        }  
        else{
            answer += x;
        }      
    }
    
    return num_list.length<=10 ? sum : answer;
}