package section5_stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 1. 올바른 괄호 (stack)
 * 설명
 *
 * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
 *
 *
 * 입력
 * 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
 *
 *
 * 출력
 * 첫 번째 줄에 YES, NO를 출력한다.
 *
 *
 * 예시 입력 1
 * (()(()))(()
 *
 * 예시 출력 1
 * NO
 *
 * [로직]
 *
 * [배운점]
 * - stack object 를 사용한 push , pop
 *
 */
public class No5_1_CorrectParentheses {

    // 강의 풀이
    public String solution(String s){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        // stack 객체에 어떠한 '(' or ')'도 남아있지않는 경우 올바른 괄호로 처리 (=YES)
        for(char x : s.toCharArray()){
            if(x== '('){
                stack.push(x);
            }else{
                if(stack.isEmpty()){
                    return "NO";        // ) 가 많은 경우 NO 반환
                }else{
                    stack.pop();
                }
            }
            if(!stack.isEmpty()){
                return "NO";            // ( 가 많은 경우 NO 반환
            }
        }

        return answer;
    }

    public static void main(String[] args){

        No5_1_CorrectParentheses correctParentheses = new No5_1_CorrectParentheses();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();

        System.out.print(correctParentheses.solution(s));
    }
}
