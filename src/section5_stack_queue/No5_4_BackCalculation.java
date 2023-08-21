package section5_stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 4. 후위식 연산(postfix) = stack data structure
 *
 * 설명
 *
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
 * (참고)
 * 중위표기식 : 연산자가 피연산자 사이에 위치
 * 후위표기식 : 연산자가 피연산자 후위 (=뒤)에 위치
 * = 연산방법
 * 1. 352+*9- 를 연산하려는 경우 전위에서부터 후위까지 스캔하면서 연산자를 탐색
 * 2. 연산자가 스캔되면 해당 연산자로 앞의 2개의 피연산자(=숫자) 를 연산실행
 * 3. 연산결과는 해당위치에 저장하고 1~2번을 반복하여 결과를 도출함
 *
 * 입력
 * 첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
 * 식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
 *
 *
 * 출력
 * 연산한 결과를 출력합니다.
 *
 *
 * 예시 입력 1
 * 352+*9-
 *
 * 예시 출력 1
 * 12
 *
 * [로직]
 * 1. 왼쪽부터 숫자를 stack 구조에 넣음
 * 2. 연산자를 만나는 경우 left pointer, right pointer 를 해당 연산자로 연산하고, 결과를 stack 에 저장함
 *
 *
 */
public class No5_4_BackCalculation {

    // [정답]
    public int solution(String str){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray() ){
            if(Character.isDigit(x)){       // 숫자인지 확인
                stack.push(x-48);      // 숫자를 statck 에 저장 ('5' -> 아스키코드 변환 -> 숫자 53 )
            }else{                          // 연산자인 경우
                int right=stack.pop();
                int left=stack.pop();
                if(x=='-') stack.push(left-right);
                if(x=='+') stack.push(left+right);
                if(x=='*') stack.push(left*right);
                if(x=='/') stack.push(left/right);
            }
        }
        answer = stack.get(0);

        return answer;
    }
    public static void main(String[] args){

        No5_4_BackCalculation backCalculation = new No5_4_BackCalculation();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(backCalculation.solution(str));
    }

}
