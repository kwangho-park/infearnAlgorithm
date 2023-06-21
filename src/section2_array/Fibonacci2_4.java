package section2_array;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 4. �Ǻ���ġ ����
* 
* 
* ����
* 1) �Ǻ���Ű ������ ����Ѵ�. �Ǻ���ġ �����̶� ���� 2���� ���� ���Ͽ� ���� ���ڰ� �Ǵ� �����̴�.
* 2) �Է��� �Ǻ���ġ ������ �� ���� �� �̴�. ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13�� ����ϸ� �ȴ�.
* 
* 
* �Է�
* ù �ٿ� �� �׼� N(3<=N<=45)�� �Էµȴ�.
* 
* 
* ���
* ù �ٿ� �Ǻ���ġ ������ ����մϴ�.
* 
* 
* ���� �Է�
* 10
* 
* ���� ���
* 1 1 2 3 5 8 13 21 34 55
* 
* ����
* 1. ArrayList�� �����ϰ� , 0~1��°��ҿ� 1�� ���� 
* 2. �Է¹��� ����-2��ŭ �ݺ��� ���� 
* 3. �հ� �ڸ� ���� ���� arrayList ��ҿ� ����
* 4. arraylist �� ����� ��Ҹ� ��� 
* 
*/
public class Fibonacci2_4 {

	
	public int[] solution(int n) {
		int[] answer=new int[n];
		answer[0]=1;
		answer[1]=1;
		for(int i=2;i<n;i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		return answer;
	}
	
	// ���� Ǯ�� 
	public static void main(String[] args) {
		
		Fibonacci2_4 Fibonacci = new Fibonacci2_4();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		for(int x : Fibonacci.solution(n)) System.out.print(x+" ");
		
	}
	
	// ���� (10~20�� �ҿ�) 
	public static void main_pkh(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(1);
		
		
		for(int loop=0;loop<n-2;loop++) {
			int num = arr.get(loop) + arr.get(loop+1);
			arr.add(num);
		}
 
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
	}

}
