function solution(num_list) {
    var answer = 0;
    
    var odd = 0;
    var even = 0;
    
    num_list.forEach((v, i, arr) => i%2===1 ? odd += v : even += v);
    
    // 크기 비교
    if(odd > even) answer = odd;
    else answer = even;
    
    return answer;
}