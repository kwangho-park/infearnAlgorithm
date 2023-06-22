package section3_TwoPointer;

import java.util.Scanner;

/*
* 
* 3_3. Max sales (sliding window �˰���)
* 
* [����]
* ������ �ƺ��� �������� ��մϴ�. ���� �ƺ��� �������� N�� ������ �������� �ְ� 
* '���ӵ� K�� ������ �ִ� �����' �� ������ ���϶�� �߽��ϴ�.
* ���� N=10�̰� 10�� ���� �������� �Ʒ��� �����ϴ�. �̶� K=3�̸�
* 12 15 11 20 25 10 20 19 13 15
* ���ӵ� 3�ϰ��� �ִ� ������� 11+20+25=56�����Դϴ�.
* 
* 
* [�Է�]
* ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�. (=����Ⱓ N, �ִ� ����� �Ⱓ K)
* �� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�. (=����� ����Ʈ)
* 
* 
* [���]
* ù �ٿ� �ִ� ������� ����մϴ�.
* 
* [���� �Է� 1] 
* 10 3
* 12 15 11 20 25 10 20 19 13 15
* 
* [���� ��� 1]
* 56
* 
* 
* [����]
* 1. �ִ� ����� �Ⱓ K���� sliding window �� start pointer(0)�� end pointer(K)�� �ʱ�ȭ�� 
* 2. �Է¹��� int[] �迭���� (=����� ����Ʈ) start-and pointer ��ŭ�� ��Ҹ� ������ int answer ������ ������ (=�����)
* 3. ���� �������� �迭 ��ü ���̵��� �ݺ��� (�ִ� ����� �Ⱓ K���� ��ü ����Ⱓ N�� �������� ���� �ݺ���)
* 4. int answer ������ �����͸� ������Ʈ�ϴ� ��� ������ �����Ǿ��ִ� ���� ���Ͽ� ū ��쿡�� ������Ʈ�� ������ 
* 5. ���� int answer ���� ����� 
*   
* 
* [�����]
* sliding window : two pointer �˰��� ����� Ȱ���ϸ�, ��곻�θ� ���� �������� ������ (=element ����) �� �̵��ϸ鼭 �����쳻�� �ִ� �����͸� �̿��ϴ� �˰���
* ��ũ : https://ji-musclecode.tistory.com/37   
* 
* 
* [���� ����] 
* 1. �ʱ� �ִ� ������� ���� 
* 2. window ������ ���� ����, �������� ���� ���ؼ� ���� ���� ���� (=�����̵� ������) 
* 3. ������������ ������ �ִ� ����װ� �� 
* 
*/
public class No3_3_MaxSales {

	// �ҿ�ð� : 20��... ������� 
	// ������ ��µ����ʰ�����! 
	public int solution_pkh(int n, int k, int[] sales) {
		int answer=0;
		int maxSales=0;
		int startPointer = 0;		// sliding window �� ������ �ʱ�ȭ 
		int endPointer = k;			// sliding window �� ������ �ʱ�ȭ 
		
		// [�ǹ���] �׳� ���������ε�?? == sliding window ??  
		for(int loop1=0;loop1<sales.length-(k-1);loop1++) {
			for(int loop2=0;loop2<endPointer;loop2++) {		// �ִ����� ���� �Ⱓ(k)������ Max sales �� ����
			
				maxSales += sales[loop1+loop2];
			}
			
			if(answer<maxSales) {
				answer = maxSales;
			}
			maxSales=0;
		}
		return answer;
	}
	
	// ���� Ǯ�� (����) 
	public int solution(int n, int k, int[] arr) {
		int sum=0;
		int answer=0;
		
		// �����̵Ǵ� ù��° window ���� 
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		answer=sum;
		
		for(int i=k;i<n;i++) {
			sum+=(arr[i]-arr[i-k]);			// ���� ��Ҵ� ���� ������ ��Ҵ� �߰��� 
			answer=Math.max(answer, sum);	// answer �� sum ���� ū������ answer�� ������ 
		}
		
		return answer;
	}

	public static void main(String[] args) {

		No3_3_MaxSales maxSales = new No3_3_MaxSales();
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();		// ��ü ����� �Ⱓ 
		int k = in.nextInt();		// �ִ� ����� �Ⱓ 
		
		int[] sales = new int[n];
		
		
		for(int loop=0;loop<n;loop++) {
			
			sales[loop] = in.nextInt();
		}
		
		System.out.print(maxSales.solution(n, k, sales));
		
		
	}
	
}
