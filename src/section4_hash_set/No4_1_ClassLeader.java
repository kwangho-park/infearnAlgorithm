package section4_hash_set;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 4-1 �б�ȸ�� (hash)
 *
 * [����]
 * �б� ȸ���� �̴µ� �ĺ��� ��ȣ A, B, C, D, E �ĺ��� ����� �߽��ϴ�.
 * ��ǥ�������� �� �л����� �ڱⰡ ������ �ĺ��� ��ȣ(���ĺ�)�� ������ ������ �������� �� ��ȣ�� ��ǥ�ϰ� �ֽ��ϴ�.
 * �������� ��ǥ�� ���� �� � ��ȣ�� �ĺ��� �б� ȸ���� �Ǿ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �ݵ�� �� ���� �б�ȸ���� ����ǵ��� ��ǥ����� ���Դٰ� �����մϴ�.
 *
 * [�Է�]
 * ù �ٿ��� �� �л��� N(5<=N<=50)�� �־����ϴ�.
 * �� ��° �ٿ� N���� ��ǥ������ ������ �ִ� �� �ĺ��� ��ȣ�� �������� ��ǥ�� ������� ���ڿ��� �Էµ˴ϴ�.
 *
 *
 * [���]
 * �б� ȸ������ ���õ� ��ȣ�� ����մϴ�.
 *
 * [���� �Է� 1]
 * 15
 * BACBACCACCBDEDE
 *
 *
 * [���� ��� 1]
 * C
 *
 * [����]
 * 1. 5���� �ĺ��� ������ ���� (A,B,C,D,E) , �б�ȸ�� ���� (String leader) �ʱ�ȭ, ����� ��ǥ �� ���� (int topCount) �ʱ�ȭ
 * 2. �ĺ��� ��ȣ�� ������ ���ڿ��� ���ʺ��� ���������� ���ڸ� Ž�� (�ݺ���)
 * 3. �����ϴ� ��� ���ڿ����� �ش� ���ڸ� ���� ('') �ϰ�, ��ǥ�� ����(int count) ���� ���� ��Ŵ
 * 4. �ݺ����� ����Ǹ� ����� ��ǥ�� ������ ���Ͽ�, ū ��� topCount �� count ������ ������Ʈ�ϰ�, leader ������ ���� �ش� �ĺ��� ������Ʈ
 * => �� �ĺ� �� ��ǥ���� 'hash map �� ������ ���� �� ���ϴ°����� �����ؾ���'
 *
 * [���Ƿ���]
 *
 *
 * [�����]
 * - map �ڷᱸ�� : key �� value �� �̷���� �ڷᱸ��
 * - hash map �̶� :
 *
 */
public class No4_1_ClassLeader {


    // [����Ǯ��] ����
    /// �ٽ� Ǯ�����
    public char solution(int n , String s){
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);        //  getOrDefault() : map ���� key�� �����ϸ� �ش� key�� value ��ȯ, �������� ������ 0 ��ȯ
        }
        // System.out.println(map.containsKey('A'));               // [����] A��� key �� �ִ��� Ȯ���ϴ� method (boolean type ��ȯ)
        // System.out.println(map.size());                         // [����] map ���� key �� ���� ��ȯ
        // System.out.println(map.remove('A'));                    // [����] Ư�� key ����
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            // System.out.println(x + " " +map.get(x));
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        No4_1_ClassLeader classLeader = new No4_1_ClassLeader();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();

        System.out.println(classLeader.solution(n,str));

    }


}
