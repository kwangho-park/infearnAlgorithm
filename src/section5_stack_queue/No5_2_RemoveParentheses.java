package section5_stack_queue;


import java.util.Scanner;
import java.util.Stack;

/**
 * 2. 괄호문자제거 (stack)
 * 설명
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 남은 문자만 출력한다.
 *
 *
 * 예시 입력 1
 * (A(BC)D)EF(G(H)(IJ)K)LM(N)
 *
 * 예시 출력 1
 * EFLM
 *
 * [로직]
 * 1. 입력받은 문자열을 char[] 타입으로 변환
 * 2. 문자열 char[]배열을 반복하면서 element 를 stack object 에 push
 * 3. 문자열의 element 중 닫는 괄호 ')' 가 나오는 경우 stack 내의 element를 '(' 까지 pop
 * 4. stack 의 데이터를 문자열 answer 로 타입 변환 후 반환
 *
 */
public class No5_2_RemoveParentheses {

    // 설계 및 코딩 30분 소요, 정답
    public String solution(String s){
        String answer = "";
        Stack<Character> stack = new Stack<Character>();

        char[] arr = s.toCharArray();
        char element = ' ';
        char check=' ';

        for(char x : arr){
            if(x==')'){
                while(true){
                    if(stack.pop() == '(') break;
                }
            }else{
                stack.push(x);
            }
        }

        for(int loop=0; loop<stack.size();loop++) {
            answer +=stack.get(loop);
        }

        return answer;
    }

    public static void main(String[] args){

        No5_2_RemoveParentheses removeParentheses = new No5_2_RemoveParentheses();

        Scanner kb = new Scanner(System.in);
        String s = kb.next();

        System.out.print(removeParentheses.solution(s));
    }
}
