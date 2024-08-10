function solution(order) {
    var answer = 0;
    
    var num = order.toString();
    
    for(n of num){
        if(n == 3 || n == 6 || n == 9)
            answer++;
    }
    
    return answer;
}