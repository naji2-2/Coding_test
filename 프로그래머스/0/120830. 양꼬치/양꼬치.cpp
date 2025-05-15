#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int solution(int n, int k) {
    int answer = 0;
    int service = floor(n/10);
    
    if(n>=10){
        answer = (12000*n) + (2000*k) - (2000*service);
    } else {
        answer = (12000*n) + (2000*k);
    }
    
    return answer;
}