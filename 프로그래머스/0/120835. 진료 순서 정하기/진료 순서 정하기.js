function solution(emergency) {
    var n = emergency.length;
    var answer = Array.from({length:n}, () => 1);
    
    for(let i = 0; i < n; i++){
        for(let j = 0; j < n; j++){
            if(emergency[i] < emergency[j])
                answer[i]++;
        }
    }
    
    return answer;
}