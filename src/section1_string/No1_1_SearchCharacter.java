package section1_string;

import java.util.Scanner;

/**
 * 1. ���� ã�� (String)
 * ����
 * �� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾�
 * �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
 * ��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
 *
 *
 * �Է�
 * ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
 * ���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
 *
 *
 * ���
 * ù �ٿ� �ش� ������ ������ ����Ѵ�.
 *
 *
 * ���� �Է� 1
 * Computercooler
 * c
 *
 * ���� ��� 1
 * 2
 *
 * [����]
 * 1. �Է¹��� ���ڿ�(String structure) �� character array structure �� ��ȯ
 * 2. �ݺ��ϸ鼭 �Է¹��� ���ڸ� ���Ͽ� ����� (count) ����
 * 3. ��� ���
 *
 */
public class No1_1_SearchCharacter {

    // ���� (10�� �ҿ�)
    public static void main (String args[]){
        String inputStr = "";

        char inputChar=' ';
        int answer=0;

        Scanner in = new Scanner(System.in);

        inputStr = in.nextLine().toLowerCase();
        inputChar = in.next().toLowerCase().charAt(0);

        char[] inputArr = inputStr.toCharArray();

        for(int loop=0;loop<inputArr.length;loop++){
            if(inputChar == inputArr[loop]){
                answer += 1;
            }
        }

        System.out.println(answer);


    }
}
