function solution(strArr) {
    var answer = [];
    
    strArr.forEach((v, i, arr)=>{
       v.search("ad") > -1 ? 0:answer.push(v); 
    });
    
    return answer;
}