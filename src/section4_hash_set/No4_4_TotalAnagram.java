package section4_hash_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 4. ��� �Ƴ��׷� ã��  (hash, sliding window)
 * ����
 *
 * S���ڿ����� T���ڿ��� �Ƴ��׷��� �Ǵ� S�� �κй��ڿ��� ������ ���ϴ� ���α׷��� �ۼ��ϼ���.
 * �Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�. �κй��ڿ��� ���ӵ� ���ڿ��̾�� �մϴ�.
 *
 *
 * �Է�
 * ù �ٿ� ù ��° S���ڿ��� �Էµǰ�, �� ��° �ٿ� T���ڿ��� �Էµ˴ϴ�.
 * S���ڿ��� ���̴� 10,000�� ���� ������, T���ڿ��� S���ڿ����� ���̰� �۰ų� �����ϴ�.
 *
 *
 * ���
 * S�ܾ T���ڿ��� �Ƴ��׷��� �Ǵ� �κй��ڿ��� ������ ����մϴ�.
 *
 *
 * ���� �Է� 1
 * bacaAacba
 * abc
 *
 * ���� ��� 1
 * 3
 *
 * [����]
 * 1. ���ڿ� S��  String type ���� �Է¹ް�, ���ڿ��� ��ҷΰ����� �迭(String[]) �� ��ȯ
 * 2. ���ڿ� T�� HashMap �� �ܾ�� Ű�� ����
 * 3. ���ڿ� �迭�� �ݺ��ϸ鼭 sliging window �����ȿ��� hashMap �� �ܾ�� ��
 * 4. hashMap�� ��� ���ڰ� �����ϴ� ��� answer ���� ����
 *
 */
public class No4_4_TotalAnagram {

    public int solution(String s, String t){
        int answer = 0;
        HashMap<Character,Integer> HM = new HashMap<>();

        char[] sArr = s.toCharArray();


        // HM �ʱⰪ ����
        for(int loop1=0 ; loop1<t.length() ; loop1++){

        }

        // T�� HM �� �ܾ ����
        for(int loop2=0; loop2 <sArr.length; loop2++){

        }


        return answer;
    }
    public static void main(String[] args){
        No4_4_TotalAnagram T = new No4_4_TotalAnagram();
        Scanner kb = new Scanner(System.in);

        String s = kb.nextLine();
        String t = kb.nextLine();

        System.out.print(T.solution(s,t));
    }
}
