package section2_array;

import java.util.Scanner;

/*
* ����
* �������� N���� �л��� �Ϸķ� �������ϴ�. �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��, �� �տ� �� �ִ�
* �������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���. 
* (�տ� �� �ִ� ����麸�� ũ�� ���̰�, �۰ų� ������ ������ �ʽ��ϴ�.)
* 
* 
* �Է�
* ù �ٿ� ���� N(5<=N<=100,000)�� �Էµȴ�. �� �����ٿ� N���� �л��� Ű�� �տ������� ������� �־�����.
* 
* 
* ���
* �������� �� �� �ִ� �ִ��л����� ����Ѵ�.
* 
* 
* ���� �Է� 1 
* 8
* 130 135 148 140 145 150 150 153
* 
* ���� ��� 1
* 5
* 
* ���� 
* 1. ù��° �ٿ� �л� ���� int ������ �Է¹��� 
* 2. �ι�° �ٿ� �л����� Ű�� int �迭�� �Է¹��� 
* 3. int �迭�� ũ�⸸ŭ �ݺ��ϸ鼭 ��Ұ��� ���� ��Ұ��� ��
* 4. ������Ұ��� ũ�� count ���� ���� ��Ŵ
* 5. count ���� ���
* 
* [�߿�] �����
* �ʹ� ������������ �����ϰ� Ǯ��� ������ ��Ȯ�ϰ� ������ �� ����    
* 
*/
public class No2_2_SeeStudent {

	
	// ����
	// ���� Ǯ�̵� �ƶ��� �����
	public static void main(String[] args) {

		No2_2_SeeStudent seeStudent = new No2_2_SeeStudent();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int[] arr = new int[n];
		
		for(int loop=0;loop<n;loop++) {
			arr[loop] = kb.nextInt();
		}

		System.out.print((seeStudent.solution(n, arr)));
	
	}
	
	public int solution(int n, int[]  arr) {
		
		int result = 0;		 
		int top=0;			// ���� ū ��� 
		
		for(int loop=0;loop<arr.length;loop++) {
			if(arr[loop] > top) {
				top = arr[loop];
				result++;
			}
		}
		
		return result;
	}

}
