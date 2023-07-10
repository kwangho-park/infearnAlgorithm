package section5_stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 1. �ùٸ� ��ȣ (stack)
 * ����
 *
 * ��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� ��YES", �ùٸ��� ������ ��NO"�� ����մϴ�.
 * (())() �̰��� ��ȣ�� ���� �ùٸ��� ��ġ�ϴ� ������, (()()))�� �ùٸ� ��ȣ�� �ƴϴ�.
 *
 *
 * �Է�
 * ù ��° �ٿ� ��ȣ ���ڿ��� �Էµ˴ϴ�. ���ڿ��� �ִ� ���̴� 30�̴�.
 *
 *
 * ���
 * ù ��° �ٿ� YES, NO�� ����Ѵ�.
 *
 *
 * ���� �Է� 1
 * (()(()))(()
 *
 * ���� ��� 1
 * NO
 *
 * [����]
 *
 * [�����]
 * - stack object �� ����� push , pop
 *
 */
public class No5_1_CorrectParentheses {

    // ���� Ǯ��
    public String solution(String s){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        // stack ��ü�� ��� '(' or ')'�� ���������ʴ� ��� �ùٸ� ��ȣ�� ó�� (=YES)
        for(char x : s.toCharArray()){
            if(x== '('){
                stack.push(x);
            }else{
                if(stack.isEmpty()){
                    return "NO";        // ) �� ���� ��� NO ��ȯ
                }else{
                    stack.pop();
                }
            }
            if(!stack.isEmpty()){
                return "NO";            // ( �� ���� ��� NO ��ȯ
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
