package section3_TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 3-1 �� �迭 ��ġ��
 * ����
 * ������������ ������ �� �� �迭�� �־����� �� �迭�� ������������ ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * 
 * �Է�
 * ù ��° �ٿ� ù ��° �迭�� ũ�� N(1<=N<=100)�� �־����ϴ�.
 * �� ��° �ٿ� N���� �迭 ���Ұ� ������������ �־����ϴ�.
 * �� ��° �ٿ� �� ��° �迭�� ũ�� M(1<=M<=100)�� �־����ϴ�.
 * �� ��° �ٿ� M���� �迭 ���Ұ� ������������ �־����ϴ�.
 * 
 * �� ����Ʈ�� ���Ҵ� int�� ������ ũ�⸦ ���� �ʽ��ϴ�.
 * 
 * ���
 * ������������ ���ĵ� �迭�� ����մϴ�.
 * 
 * 
 * ���� �Է� 1 
 * 3
 * 1 3 5
 * 5
 * 2 3 6 7 9
 * 
 * ���� ���
 * 1 2 3 3 5 6 7 9 
 * 
 * [�� ���� : �ð����⵵ ����]  
 * 1. �ΰ��� int �迭�� �Է¹��� 
 * 2. �ϳ��� int �迭�� ���� 
 * 3. Arrays.sort() �Լ��� �������� ����
 * 
 * [���� ���� : �ð����⵵ ����]
 * 1. �ΰ��� �迭�� ������ �����͸� ����  
 * 2. �� �����Ͱ� ����Ű�� �迭�� ��Ұ��� ���Ͽ�, ���� ���� ��� �� (answer�迭) �� ������ 
 * 
 * [�����]
 * two pointer �˰����� �׽�Ʈ�ϴ� ������ (�ð����⵵�� ���̴� �ڵ�)
 * ==> ���� �� o(n log n ) vs  o(n)
 *   
 * 
 * [��Ÿ] 
 * System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) �Լ�  
 * src : ���� �迭 
 * srcPos : ���� �迭 ������
 * dest : ������ �迭 
 * destPos : ������ �迭 ������ 
 * length : ������ �迭 ����� ��
 * 
 * 
 * 
 * @author dream
 *
 */
public class TwoArray3_1 {

	
	// �ҿ�ð� �� 30��
	// [����] �׷��� �����ǵ��� ���̰� �ִ� Ǯ���� ... two pointer 
	public int[] solution_pkh(int[] n, int m, int[] twoArr, int twoCnt) {
		
		int totalCnt = m + twoCnt; 
		
		int[] answer = new int[totalCnt];
		
		// add array (������ Ȯ��) // 
		System.arraycopy(n,0, answer, 0, m);		
		System.arraycopy(twoArr,0, answer, m, twoCnt);		
		
		
		// ���� ���� ���� //  
		Arrays.sort(answer);
		
		return answer;
	
	}
	
	// [����] ���� Ǯ�� 
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		
		int p1=0;		// �迭 a�� ������ 
		int p2=0;		// �迭 b�� ������

		while(p1<n && p2<m) {		// �� �� �ϳ��� �迭�� �񱳰� ������� �ݺ����� ������     
			if(a[p1]<b[p2]) {
				answer.add(a[p1++]);
			}else {
				answer.add(b[p2++]);
			}
		}
		
		// ���� �迭 ��Ҹ� ����� �߰�
		while(p1<n) answer.add(a[p1++]);
		while(p2<m) answer.add(b[p2++]);
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		TwoArray3_1 TwoArray = new TwoArray3_1();
		
		// �Է� ���� // 
		int n = kb.nextInt();
		int[] a = new int[n];
		
		for(int loop=0;loop<n;loop++) {
			a[loop] = kb.nextInt();
		}
		
		int m = kb.nextInt();
		int[] b = new int[m];
		
		for(int loop2=0;loop2<m;loop2++) {
			b[loop2] = kb.nextInt();
		}
		
		// ��� ��� 
		for(int x:TwoArray.solution(n, m, a, b)) System.out.print(x+" ");
		
		
	}

}
