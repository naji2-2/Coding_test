function solution(s) {
    var answer = '';
    let numbers = [];
    
    let str = s.split(" ");
    
    for(let x of str){
        numbers.push(parseInt(x));
    }
    
    let max = parseInt(str[0]);
    let min = parseInt(str[0]);
    
    for(let x of numbers){
        if(x > max){
            max = x;
        } else if(x < min){
            min = x;
        }
    }
    
    answer += min.toString().concat(" ", max.toString());
    
    return answer;
}