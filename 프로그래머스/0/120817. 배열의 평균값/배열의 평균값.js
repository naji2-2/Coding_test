function solution(numbers) {
    var answer = 0;
    
    var sum = numbers.reduce( function(a,c) {
        return a+c;
    })
    
    answer = sum/numbers.length
    
    return answer;
}