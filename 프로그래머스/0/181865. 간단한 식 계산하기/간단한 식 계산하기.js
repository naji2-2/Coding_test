function solution(binomial) {
    var answer = 0;
    
    var n = binomial.split(" ");
    var a = parseInt(n[0]);
    var b = parseInt(n[2]);
    
    switch(n[1]){
        case "+":
            return a + b;
        case "-":
            return a - b;
        case "*":
            return a * b;
    }
    
}