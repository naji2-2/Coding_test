function solution(array) {
    var answer = [];
    
    var max = 0;
    var index = 0;
    
    for(i in array){
        if(max<array[i]){
            max = array[i];
            index = i;
        }        
    }
    answer.push(max);
    answer.push(parseInt(index));

    return answer;
}