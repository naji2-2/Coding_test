function solution(i, j, k) {
    var answer = 0;

    for(i; i<=j; i++){
        for(var n of i.toString()){
            if(n==k)
                answer++;   
        }
    }
    
    return answer;
}