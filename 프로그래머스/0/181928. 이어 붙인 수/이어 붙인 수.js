function solution(num_list) {
    var answer = 0;
    var odd_str = "";
    var even_str = "";
    
    for(i of num_list){
        if(i%2==0){ // i가 짝수인 경우
            odd_str += i.toString();    // i를 문자열로 변환
        }
        else{       // i가 홀수인 경우
            even_str += i.toString();
        }
    }
    
   answer = Number(odd_str) + Number(even_str); // i를 숫자로 변환
    
    return answer;
}