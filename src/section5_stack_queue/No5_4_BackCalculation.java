package section5_stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 4. ������ ����(postfix) = stack data structure
 *
 * ����
 *
 * ����������� �־����� ������ ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * ���� 3*(5+2)-9 �� ������������� ǥ���ϸ� 352+*9- �� ǥ���Ǹ� �� ����� 12�Դϴ�.
 * (����)
 * ����ǥ��� : �����ڰ� �ǿ����� ���̿� ��ġ
 * ����ǥ��� : �����ڰ� �ǿ����� ���� (=��)�� ��ġ
 * = ������
 * 1. 352+*9- �� �����Ϸ��� ��� ������������ �������� ��ĵ�ϸ鼭 �����ڸ� Ž��
 * 2. �����ڰ� ��ĵ�Ǹ� �ش� �����ڷ� ���� 2���� �ǿ�����(=����) �� �������
 * 3. �������� �ش���ġ�� �����ϰ� 1~2���� �ݺ��Ͽ� ����� ������
 *
 * �Է�
 * ù �ٿ� ����������� �־����ϴ�. ������� ���̴� 50�� ���� �ʽ��ϴ�.
 * ���� 1~9�� ���ڿ� +, -, *, / �����ڷθ� �̷������.
 *
 *
 * ���
 * ������ ����� ����մϴ�.
 *
 *
 * ���� �Է� 1
 * 352+*9-
 *
 * ���� ��� 1
 * 12
 *
 * [����]
 * 1. ���ʺ��� ���ڸ� stack ������ ����
 * 2. �����ڸ� ������ ��� left pointer, right pointer �� �ش� �����ڷ� �����ϰ�, ����� stack �� ������
 *
 *
 */
public class No5_4_BackCalculation {

    // [����]
    public int solution(String str){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray() ){
            if(Character.isDigit(x)){       // �������� Ȯ��
                stack.push(x-48);      // ���ڸ� statck �� ���� ('5' -> �ƽ�Ű�ڵ� ��ȯ -> ���� 53 )
            }else{                          // �������� ���
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
