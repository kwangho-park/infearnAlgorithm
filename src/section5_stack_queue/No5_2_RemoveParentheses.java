package section5_stack_queue;


import java.util.Scanner;
import java.util.Stack;

/**
 * 2. ��ȣ�������� (stack)
 * ����
 * �Էµ� ���ڿ����� �Ұ�ȣ ( ) ���̿� �����ϴ� ��� ���ڸ� �����ϰ� ���� ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 *
 * �Է�
 * ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
 *
 * ���
 * ���� ���ڸ� ����Ѵ�.
 *
 *
 * ���� �Է� 1
 * (A(BC)D)EF(G(H)(IJ)K)LM(N)
 *
 * ���� ��� 1
 * EFLM
 *
 * [����]
 * 1. �Է¹��� ���ڿ��� char[] Ÿ������ ��ȯ
 * 2. ���ڿ� char[]�迭�� �ݺ��ϸ鼭 element �� stack object �� push
 * 3. ���ڿ��� element �� �ݴ� ��ȣ ')' �� ������ ��� stack ���� element�� '(' ���� pop
 * 4. stack �� �����͸� ���ڿ� answer �� Ÿ�� ��ȯ �� ��ȯ
 *
 */
public class No5_2_RemoveParentheses {

    // ���� �� �ڵ� 30�� �ҿ�, ����
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
