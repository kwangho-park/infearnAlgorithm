package section4_hash_set;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 3. ������� ���� (hash, sliding window)
 * ����
 *
 * ������ �ƺ��� �������� ��մϴ�. �����ƺ��� �������� N�� ������ �������� �ְ� ���ӵ� K�� ������ ������� ������
 * �� �������� ���϶�� �߽��ϴ�.
 * ���� N=7�̰� 7�� ���� �������� �Ʒ��� ����, �̶� K=4�̸�
 * 20 12 20 10 23 17 10
 *
 * �������� : ���ӵ� K�� ������ �������� (��, �ߺ�����)
 *
 * �� ���� 4�ϰ��� ������ ����������
 * ù ��° ������ [20, 12, 20, 10]�� ������� ������ 20, 12, 10���� 3�̴�.
 * �� ��° ������ [12, 20, 10, 23]�� ������� ������ 4�̴�.
 * �� ��° ������ [20, 10, 23, 17]�� ������� ������ 4�̴�.
 * �� ��° ������ [10, 23, 17, 10]�� ������� ������ 3�̴�.
 *
 * N�ϰ��� �����ϰ� ���ӱ����� ���� K�� �־����� ù ��° �������� �� ������
 * ������� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
 *
 *
 * �Է�
 * ù �ٿ� ���� ���� N(5<=N<=100,000)�� ����� ���� �Ⱓ K(2<=K<=N)�� �־����ϴ�.
 * �� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.
 *
 *
 * ���
 * ù �ٿ� �� ������ ����� ������ ������� ����մϴ�.
 *
 *
 * ���� �Է� 1
 * 7 4
 * 20 12 20 10 23 17 10
 *
 * ���� ��� 1
 * 3 4 4 3
 *
 * [����]
 *
 */
public class No4_3_TypeOfSales {

    // ��������
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();

        // K�� ������ ����� �ʱⰪ ����
        // ex 7�ϰ� ������(arr)���� 1~4�ϱ����� ����� ������ HashMap (HM)�� ������
        for(int i=0; i<k-1; i++){
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
        }
        int lt=0;       // left pointer (two pointer algorithm)

        // sliding window
        for(int rt=k-1; rt<n; rt++){            // rt ���� (right pointer)

            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1); // ����� ������ ī�����Ͽ� HM�� ����)
            answer.add(HM.size());              // ����� ���� ����

            HM.put(arr[lt], HM.get(arr[lt])-1);

            if(HM.get(arr[lt])==0) {            // ���ӵ� K�� ���� �����(key)�� ���� ���(value = 0��) hashMap ���� ����
                HM.remove(arr[lt]);
            }
            lt++;       // left pointer ����
        }
        return answer;
    }

    public static void main(String[] args){
        No4_3_TypeOfSales T = new No4_3_TypeOfSales();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
    }

}
