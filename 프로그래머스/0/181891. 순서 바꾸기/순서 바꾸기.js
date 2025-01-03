function solution(num_list, n) {
    var answer = [];
    
    var a = num_list.slice(0, n);
    answer = num_list.slice(n, num_list.length);
    answer.push(...a);

    return answer;
}