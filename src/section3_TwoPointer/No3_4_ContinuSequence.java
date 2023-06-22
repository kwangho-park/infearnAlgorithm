package section3_TwoPointer;

import java.util.Scanner;

/**
 * 3-4 ���� �κм���
 * 
 * N���� ���� �̷���� ������ �־����ϴ�.
 * �� �������� ���Ӻκ� ������ ���� Ư������ M�� �Ǵ� ��찡 �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���. 
 * 
 * ���� N=8, M=6�̰� ������ ������ ���ٸ�
 * 1 2 1 3 1 1 1 2
 * ���� 6�� �Ǵ� ���Ӻκм����� (2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}�� �� 3�����Դϴ�.
 * 
 * 
 * 1. �Է� ���� 
 * ù° �ٿ� N(1<=N<=100,000), M(1<=M<=100,000,000)�� �־�����.
 * ������ ���Ұ��� 1,000�� ���� �ʴ� �ڿ����̴�.
 * 
 * 2. ��� ����
 * ù° �ٿ� ����� ���� ����Ѵ�.
 * 
 * �Է� ���� 
 * 8 6
 * 1 2 1 3 1 1 1 2
 * 
 * ��� ����
 * 3
 * 
 * [����] 
 * 1.M (�հ�=6) ���� ���ö����� ��Ҹ� �ݺ��ϸ鼭 �հ踦 ���� 
 * 2.����� �հ谡 6�ΰ�� answer ���� 1���� ��Ű�� �ݺ��� ���� 
 * 3.����� �հ谡 6�ʰ� �� ��� ������ �۾����� �ݺ��� ���� 
 *  
 * [���Ƿ���] = two pointer �˰��� Ȱ��
 * 
 * 
 * 
 * [�����]
 * o(n2)�� o(n)���� �ذ��ϴ� ����� (two pointer, siding window �˰��� ) 
 *  
 * @author dream
 *
 */
public class No3_4_ContinuSequence {

	
	// �ҿ�ð� : 30�� 
	// Ʋ��!! (�ð����⵵�� o(n2) ������ �ش� Ǯ�̴� �ǰ�������� , M���� ũ�� �־����ٸ� �ش� ������ ���ϰ� ������) 
	public int solution_pkh(int n, int m, int[] arr) {
		int answer=0;
		int sum=0;
		
		for(int loop=0;loop<arr.length;loop++) {
			for(int loop2=loop;loop2<arr.length;loop2++) {
				sum += arr[loop2];
				if(sum==m) {		// �հ谡 m�� ��� 
					answer++;
					sum=0;
					break;
				}else if(sum>m) {	// �հ谡 m�ʰ� �ΰ�� 
					sum=0;
					break;
				}	
			}
		}
		
		return answer;
	}
	
	// ����Ǯ�� 
	///// ���� ���������� �ٽ� Ǯ������� 
	public int solution(int n, int m, int[] arr) {
		int answer=0;		// ī��Ʈ�ϴ� ���� 
		int sum=0;
		int lt=0;			// left pointer 
		
		// right pointer ���� 
		for(int rt=0;rt<n;rt++) {
			sum+=arr[rt];
			if(sum==m) {
				answer++;
			}
			
			// left pointer ����
			while(sum>=m) {		// while�� ���� : lt�� �ϳ��������� 6���� ū��찡 ���� (ex 1,1,1,1,5) 
				sum -=arr[lt++];
				if(sum==m) {
					answer++;
				}
			}
		}
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		
		No3_4_ContinuSequence ContinuSequence = new No3_4_ContinuSequence();
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[] arr = new int[n];
		
		for(int loop=0;loop<arr.length;loop++) {
			arr[loop] = in.nextInt();
		}
		
		System.out.print(ContinuSequence.solution(n, m, arr));
		
		
	}

}
