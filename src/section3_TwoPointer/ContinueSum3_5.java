package section3_TwoPointer;

import java.util.Scanner;

/**
* 5. ���ӵ� �ڿ����� ��
* ����
* N�Է����� ���� ���� N�� �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
* ���� N=15�̸�
* 
* 7+8=15
* 4+5+6=15
* 1+2+3+4+5=15
* 
* �� ���� �� 3������ ��찡 �����Ѵ�.
* 
* 
* �Է�
* ù ��° �ٿ� ���� ���� N(7<=N<1000)�� �־����ϴ�.
* 
* 
* ���
* ù �ٿ� �� ������ ����մϴ�.
* 
* 
* ���� �Է� 1 
* 15
* 
* ���� ��� 1
* 3
* 
* [����] - two pointer �˰��� 3_4�� ���� ���� 
* 1. ���� n�� �Է¹���
* 2. lt, rt �ʱ�ȭ 
* 3. rt�� �ݺ������� 1�� �����ϸ鼭 sum���� ����
* 4. sum ���� n�� ũ�ų� ���� ������ ���ѷ����� lt���� sum ������ �y������ 
* 5. sum ���� n�� ���������� ��쿡�� answer ���� ������Ŵ      
* 
* 
* [���� ����]
* 1. �ִ� �ڿ��� : (n / 2) + 1 
* 2. �Է¹��� n���� ������ ���� 
* 3. �������� ���� ������ ������ 
* 
 * @author kwang
 *
 */
public class ContinueSum3_5 {

	// �ҿ�ð� : 30�� (����/�ڵ�) 
	// ���� !
	public int solution_pkh(int n) {
		int answer = 0;
		int sum=0;
		int lt=1;
		
		for(int rt=1;rt<n;rt++) {
			sum+=rt;
			if(sum==n) {
				answer++;
			}
			
			while(sum>=n) {
				sum-=lt;
				lt++;
				if(sum==n ) {
					answer++;
				}
			}
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		ContinueSum3_5 ContinueSum = new ContinueSum3_5();
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		System.out.print(ContinueSum.solution_pkh(n));
		
	}

}
