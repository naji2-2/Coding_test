function solution(todo_list, finished) {
    var answer = [];
    
    todo_list.forEach((v, i, arr) => finished[i]? 0:answer.push(v));
    
    return answer;
}