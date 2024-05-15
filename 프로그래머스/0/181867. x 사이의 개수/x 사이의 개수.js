function solution(myString) {
    var answer = [];
    var str = myString.split("x");      // 문자열을 x를 기준으로 나눔
    var o = 0;
    
    for(let i of str){                  // i는 배열의 값
        if(i.length>0)
            answer[o] = i.length;
        else
           answer[o] = 0; 
        o++;
    }
    
    return answer;
}