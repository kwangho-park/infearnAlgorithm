package section2_array;

import java.util.Scanner;

/**
 * ������ϱ�
 * 
 * ����
 * N���� �л��� ���������� �ԷµǸ� �� �л��� ����� �Էµ� ������� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * ���� ������ �Էµ� ��� ���� ����� ���� ó���Ѵ�.
 * �� ���� ���� ������ 92���ε� 92���� 3�� �����ϸ� 1���� 3���̰� �� ���� �л��� 4���� �ȴ�.
 * 
 * 
 * �Է�
 * ù �ٿ� N(3<=N<=100)�� �Էµǰ�, �� ��° �ٿ� ���������� �ǹ��ϴ� N���� ������ �Էµȴ�.
 * 
 * 
 * ���
 * �Էµ� ������� ����� ����Ѵ�.
 * 
 * 
 * ���� �Է� 1 
 * 5
 * 87 89 92 100 76
 * 
 * ���� ��� 1
 * 4 3 2 1 5
 * 
 * [�����]
 * -�Ӹ��� ��� �� �� ��Ȱ�ϰ� Ǯ������������ �׸��� �׸��� �Ǹ����� ���� 
 * -����for������ ��Ҹ� �ϳ��� ���Ͽ� ����� �ο��ϴ°��� �����Ͽ�����, 
 * ���� ����� ���ö��� ���� ó���� �ذ��� �ȉ���� 
 * 
 * @author kwang
 *
 */
public class No2_8_Grade {
	
	// ������ ���� ������ ���� (10�а��)  
	// ���� Ǯ�� 
	// �絵�� ����
	public static void main(String[] args) {

		No2_8_Grade Grade = new No2_8_Grade();
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int loop=0;loop<n;loop++) {
			arr[loop] = scan.nextInt();
		}
		
		for(int x:Grade.solution(n, arr)) {
			System.out.print(x+" ");
		}
		

	}
	
	
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		for(int i=0;i<n;i++) {
			int cnt=1;				// ��� �ʱ�ȭ 
			
			for(int j=0;j<n;j++) {	// ����Ұ��� �� 
				if(arr[j]>arr[i]) cnt++;		// �������
			}
			answer[i] = cnt;
		}
		return answer;
	}

}
