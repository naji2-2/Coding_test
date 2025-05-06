function solution(myString, pat) {
    
    myString = myString.replace(/A/g, "o");
    myString = myString.replace(/B/g, "A");
    myString = myString.replace(/o/g, "B");
    
    return myString.search(pat) > -1 ? 1 : 0;
}