function solution(arr, divisor) {
    var answer = [];
    
    for(var x of arr){
        if(x%divisor==0)
            answer.push(x);
    }
    
    answer.sort(function(comp1, comp2) {
	    return comp1 - comp2; 
    });
    
    if(answer == "")
        answer.push(-1)
    
    return answer;
}