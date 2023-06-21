package section3_TwoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

/*
* 3_2 CommonElement (two pointers �˰���, ������ ����)
* 
* A, B �� ���� ������ �־����� ���� ������ ���� ���Ҹ� �����Ͽ� ���������� ���� ����ϴ� ���� �׷��� �ۼ��ϼ���.
* 
* [�Է¼���]
* ù ��° �ٿ� ���� A�� ũ�� N(1<=N<=30,000)�� �־����ϴ�.
* �� ��° �ٿ� N���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
* �� ��° �ٿ� ���� B�� ũ�� M(1<=M<=30,000)�� �־����ϴ�.
* �� ��° �ٿ� M���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
* �� ������ ���Ҵ� 1,000,000,000������ �ڿ����Դϴ�.
* 
* [��¼���]
* �� ������ ������Ҹ� �������� �����Ͽ� ����մϴ�.
* 
* [���� �Է� 1 ]
* 5
* 1 3 9 5 2
* 5
* 3 2 5 7 8
* 
* [���� ��� 1]
* 2 3 5
* 
* [����]
* 1. 2���� int[] �迭�� �Է¹��� 
* 2. ù��° �迭�� ��������, �ι�° �迭�� 0�� index ���� max index���� �ݺ��ϸ鼭 ������ element �� ã��
* 3. �߰ߵ� element�� int[] answer�� ������ 
* 4. (??) answer �迭�� Arrays.sort() �Լ��� �������� �����ϰ� ����� 
* 
* 
* [�����]
* two pointer �˰��� :  
* ���۸����� chatGPT �� Ȱ���ϸ� �˻��� ���ݴ� �����ϰ� ���� 
* 
* 
* [���� ����]
* 1. ���� A,B �� �������� ����
* ���� A : 1 2 3 5 9
* ���� B : 2 3 5 7 8 
*   
* 2. pointer 1�� ���� A�� ù���� ��Ҹ� ����Ű��, pointer 2�� ���� B�� ù��° ��Ҹ� ����Ŵ 
* 3. pointer 1,2 ���� ���Ͽ� ���� ���� pointer ������Ŵ 
* 4. pointer 1,2 ���� ���Ͽ� ���� ���� ��� ������ҷ� ������
* 
*/
public class CommonElement3_2 {

	
	// ���� Ǯ�� (����)  
	public ArrayList<Integer> solution_2(int n, int[] oneArr, int m, int[] twoArr ) {
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		Arrays.sort(oneArr);
		Arrays.sort(twoArr);
		
		int p1=0;
		int p2=0;
		
		while(p1<n && p2<m) {
			
			if(oneArr[p1] ==twoArr[p2] ) { // ������ 
				answer.add(oneArr[p1]);
				p1++;
				p2++;	
			}else if(oneArr[p1] < twoArr[p2]) {
				p1++;
			}else{
				p2++;
			}
		}

		return answer;
	}
	
	
	
	// 20�мҿ� 
	// ���� 
	public ArrayList<Integer> solution(int n, int[] oneArr, int m, int[] twoArr ) {
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int oneElement:oneArr) {
			for(int loop=0; loop<m; loop++) {
				if(oneElement==twoArr[loop]) {		
					answer.add(twoArr[loop]);
				}
			}
		}
		
		Collections.sort(answer);
		
		
		return answer;
	}
	
	public static void main(String[] args) {

		CommonElement3_2 commonElement = new CommonElement3_2();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int [] oneArr = new int[n];
		
		for(int loop=0;loop<n;loop++) {
			oneArr[loop] = scan.nextInt(); 
		}
		
		int m = scan.nextInt();
		int [] twoArr = new int[m];
		
		for(int loop2=0;loop2<m;loop2++) {
			twoArr[loop2] = scan.nextInt();
		}
		
		for(int x :commonElement.solution_2(n, oneArr, m, twoArr)) {
			System.out.print(x+" ");
		}
		
	}
}
