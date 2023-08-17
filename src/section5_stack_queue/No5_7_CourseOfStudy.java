package section5_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 7. �������� ���� (queue) 
 * ����
 *
 * ������ 1�� ������ ������ȹ�� ¥�� �մϴ�.
 *
 * �����߿��� �ʼ������� �ֽ��ϴ�. �� �ʼ������� �ݵ�� �̼��ؾ� �ϸ�, �� ������ ������ �ֽ��ϴ�.
 *
 * ���� �� ������ A, B, C, D, E, F, G�� �ְ�, ���⼭ �ʼ������� CBA�� �־����� �ʼ������� C, B, A�����̸� �� ������� �� ������ȹ�� ¥�� �մϴ�.
 *
 * ���⼭ ������ B������ C������ �̼��� �Ŀ� ���� �ϰ�, A������ C�� B�� �̼��� �Ŀ� ���� �Ѵٴ� ���Դϴ�.
 *
 * ������ C, B, D, A, G, E�� ������ȹ�� ¥�� ����� �� ����������
 *
 * C, G, E, A, D, B ������ ®�ٸ� �� �� ����� ������ȹ�� �˴ϴ�.
 *
 * ������ȹ�� �� ������� �տ� ������ �̼��Ǹ� ���� ������ �����ϴٴ� ������ �ؼ��մϴ�.
 *
 * ������ȹ������ �� ������ ������ �̼��ȴٰ� �����մϴ�.
 *
 * �ʼ���������� �־����� ������ § N���� �������谡 �ߵ� ���̸� ��YES", �߸��� ���̸� ��NO���� ����ϴ� ���α׷��� �ۼ��ϼ���.
 *
 *
 * �Է�
 * ù �ٿ� �� �ٿ� �ʼ������� ������ �־����ϴ�. ��� ������ ���� �빮���Դϴ�.
 *
 * �� �� ° �ٺ��� ������ § �������谡 �־����ϴ�.(���������� ���̴� 30�����̴�)
 *
 *
 * ���
 * ù �ٿ� �������谡 �ߵ� ���̸� ��YES", �߸��� ���̸� ��NO���� ����մϴ�.
 *
 *
 * ���� �Է� 1
 * CBA
 * CBDAGE
 *
 * ���� ��� 1
 * YES
 */
public class No5_7_CourseOfStudy {

    // ����
    public String solution(String need, String plan){
        String answer="YES";
        Queue<Character> Q=new LinkedList<>();
        for(char x : need.toCharArray()) Q.offer(x);
        for(char x : plan.toCharArray()){
            if(Q.contains(x)){
                if(x!=Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args){
        No5_7_CourseOfStudy T = new No5_7_CourseOfStudy();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.println(T.solution(a, b));
    }
}
