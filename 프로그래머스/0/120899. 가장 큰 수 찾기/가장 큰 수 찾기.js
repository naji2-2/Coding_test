function solution(array) {
    var answer = [];
    
    var max = 0;
    let index = 0;
    //var i = Number(0);
    
    for(var i in array){
        if(max<array[i]){
            max = array[i];
            index = i;
            //index = parseInt(i);
            //console.log(typeof index);
            
        }        
    }
    answer.push(max);
    console.log(typeof index);
    //-0을 적으면 숫자로 형변환 해줌
    answer.push(index-0);
    return answer;
}