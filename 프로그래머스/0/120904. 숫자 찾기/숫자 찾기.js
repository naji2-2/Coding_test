function solution(num, k) {

    num = num.toString();
    return num.search(k) > -1 ? num.search(k)+1 : -1;
    
}