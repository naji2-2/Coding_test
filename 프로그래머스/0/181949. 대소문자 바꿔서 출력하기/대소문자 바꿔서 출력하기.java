import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer ="";
        
        for(int i=0; i<a.length(); i++){
         
            char ch = a.charAt(i);
           
            if(Character.isLowerCase(ch)){                // ch가 소문자일 경우
               answer += Character.toUpperCase(ch);       // 대문자로 변환
            }
            else{                                        // ch가 대문자일 경우
               answer += Character.toLowerCase(ch);       // 소문자로 변환
            }
        }
        
        System.out.print(answer);
        
    }
}