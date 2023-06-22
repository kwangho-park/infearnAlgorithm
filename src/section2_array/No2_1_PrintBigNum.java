package section2_array;

import java.util.ArrayList;
import java.util.Scanner;

/*
* ����
* N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
* (ù ��° ���� ������ ����Ѵ�)
* 
* 
* �Է�
* ù �ٿ� �ڿ��� N(1<=N<=100)�� �־�����, �� ���� �ٿ� N���� ������ �Էµȴ�.
*  
* 
* 
* ���
* �ڽ��� �ٷ� �� ������ ū ���� �� �ٷ� ����Ѵ�.
* 
* 
* ���� �Է�
* 6
* 7 3 9 5 6 12
* 
* ���� ��� 
* 7 9 6 12
* 
* [�߿�] ����� 
* 1. ���ؾ��ϴ� ���� �ڿ����̱� ������ int type ���� �Է¹����� ���Ŀ� ó���ϱⰡ ���� (String type���� ��ȯ�ϸ� ��ȿ������) 
* 
* 
*/
public class No2_1_PrintBigNum {

	
	// ���� Ǯ�� 
	public static void main(String[] args) {
		
		No2_1_PrintBigNum printBigNum = new No2_1_PrintBigNum();
		
		Scanner kb = new Scanner(System.in);
		
		int n =kb.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		
		// arraylist �� �ݺ��ϸ鼭 ����� 
		for(int x : printBigNum.solution(n, arr)) {
			System.out.print(x+" ");
		}
		
	}
	
	// ���� Ǯ�� 
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		answer.add(arr[0]);
		for(int loop=1;loop<n;loop++) {
			if(arr[loop] > arr[loop-1]) {
				answer.add(arr[loop]);
			}
		}
		
		
		return answer;
	}
	
	
	//------------------------------------------------
	
	
	// ����
	// �� Ǯ��  
	public static void main_pkh(String[] args) {

		Scanner in = new Scanner(System.in);
		String input1 = in.nextLine();
		String input2 = in.nextLine();
		
		No2_1_PrintBigNum printBigNum = new No2_1_PrintBigNum();
		
		System.out.println(printBigNum.solution_pkh(input1, input2));

	}
	
	// �� Ǯ��
	public String solution_pkh(String input1, String input2 ) {
		String result="";
		String[] StringArr = input2.split(" ");

		int num1 = 0;
		int num2 = 0;
		
		int length = Integer.parseInt(input1); 
		
		
		for(int loop=0;loop<StringArr.length;loop++) {
			
			// ù��° �� �ֱ�
			if(loop==0) {
				result = StringArr[loop];	
				
			}else {
				num1 = Integer.parseInt(StringArr[loop-1] +"");
				num2 = Integer.parseInt(StringArr[loop] +"");
				
				if(num1<num2) {
					result += (" "+num2);
				}
			}
		}
		
		
		return result;
	}

}
