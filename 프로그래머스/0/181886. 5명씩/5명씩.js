function solution(names) {
    var answer = [];
    
    for(var i=0; i<names.length; i+=5){
        console.log(i);
        answer.push(names[i]);
    }

    return answer;
}