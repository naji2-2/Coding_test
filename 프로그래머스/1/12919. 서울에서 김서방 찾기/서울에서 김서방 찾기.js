function solution(seoul) {
    var answer = '';
    var num = seoul.findIndex(element => element == "Kim")
    
    answer = "김서방은 " + num + "에 있다";
    
    return answer;
}