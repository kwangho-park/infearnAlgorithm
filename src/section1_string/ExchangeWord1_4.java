package section1_string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * �Է�
 * ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
 * �� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
 * 
 * ��� : N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ����� ����մϴ�.
 *  
 * ���� input 
 * 3
 * good
 * Time
 * Big
 * 
 * ���� output 
 * doog
 * emiT
 * giB
 * 
 * [�߿�] �����
 * 1. nextInt(), next �� ����� �ٹٲ� �������� �Է��� ������
 * = 1�ð� �ҿ� (nextInt() �� ������� ��Ȯ�ϰ� �����������ؼ� �׽�Ʈ �ð� �����̰� �߻��� )
 * 2. StringBuilder lib���� �� ���� Ȯ�� 
 * 
 * 
 * 
 * 
 * @author kwang
 *
 */
public class ExchangeWord1_4 {

	// ���� Ǯ�� 
	public static void main(String[] args) {
		
		ExchangeWord1_4 ExchangeWord = new ExchangeWord1_4();
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		String[] inputArr = new String[n];
		
		for(int loop=0;loop<inputArr.length;loop++) {
			inputArr[loop] = in.next();
		}
		
		for(String value:ExchangeWord.solution_2(n, inputArr)) {
			System.out.println(value);
		}
		
	}
	
	// ���� Ǯ�� 1 (StringBuilder lib Ȱ��)
	public ArrayList<String> solution_1(int n, String[] str){
		
		ArrayList<String> resultArr = new ArrayList<String>();
		
		
		for(String value:str) {
			StringBuilder stringBuilder = new StringBuilder(value);
			String tmp = stringBuilder.reverse().toString();
			resultArr.add(tmp);
		}
		
		return resultArr;
	}
	 
	
	
	// ���� ������ ������ �ͼ������ʾƼ� �ٽ��ѹ� ���� �ʿ��ҵ��� 
	// ���� Ǯ�� 2 (���� ������) 
	public ArrayList<String> solution_2(int n, String[] str){
		ArrayList<String> resultArr = new ArrayList<String>();
		
		for(String value:str) {
			char[] charArr = value.toCharArray();
			int left = 0;						// left 								
			int right = value.length()-1;		// right

			while(left<right) {
				char tmp = charArr[left];
				charArr[left] = charArr[right];
				charArr[right] = tmp;
				left++;
				right--;
			}
			String tmp=String.valueOf(charArr);
			resultArr.add(tmp);
		}
		
		
		return resultArr;		
	}
	
	
	////////////////////////////////////////////////////////////////////////
	
	// ���� (������������) 
	public static void main_pkh(String[] args) {
		
		
		ArrayList<String> inputArr = new ArrayList<String>();
		ArrayList<String> outputArr = new ArrayList<String>();
		
		Scanner in = new Scanner(System.in) ;	
		
		// input data 
		String countStr = in.nextLine();
		int count = Integer.parseInt(countStr);
		
		for(int loop=0; loop<count; loop++) {
			inputArr.add(in.nextLine());
		}
		
		
		// ������ ���� 
		int dataSize = 0;
		String data = "";
		String afterData = "";
		
		for(int loop=0;  inputArr.size()>loop; loop++) {
			
			data = inputArr.get(loop);
			dataSize = inputArr.get(loop).length();
			
			
			for(int loop2=dataSize-1; 0<=loop2; loop2--) {
				afterData += data.charAt(loop2);
			}
			outputArr.add(afterData);
			
			data ="";
			dataSize=0;
			afterData="";
			

		}

		// ������ ��� 
		for(String str:outputArr) {
			System.out.println(str);
		}

	}

}
