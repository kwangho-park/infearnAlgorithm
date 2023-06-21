package section1_string;

import java.util.Scanner;

/**
 * ���� �� �ܾ�  <br> 
 * �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
 * ������� �� �ܾ�� �������� ���е˴ϴ�.
 * 
 * input :  ù �ٿ� ���̰� 100�� ���� �ʴ� �Ѱ��ǹ����� �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ��ֽ��ϴ�.
 * output : ù�ٿ� ���� ��ܾ ����Ѵ�. ���� ���̰� ��ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ�� �ܾ ������ �Ѵ�.
 * 
 * ���� : it is time to study -> study
 * 
 * @author kwang
 *
 */
public class WordInSentence1_3 {

	
	// ���� Ǯ�� 1
	public static void main(String args[]) {
		
		String answer = "";
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		
		int m = Integer.MIN_VALUE;		// Integer �� ���� �ּҰ����� �ʱ�ȭ 
		String[] s = str.split(" ");
		
		for(String x : s) {
			int len=x.length();
			if(len>m) {
				m=len;
				answer=x;
			}
		}
		
		System.out.print(answer);
		
	}
	
	// ���� : 35�мҿ� (��������,�ڵ�,�׽�Ʈ) 
	// ���� ���� ����
	public static void main_pkh(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		String inputStr = in.nextLine();
		
		String[] inputArr = inputStr.split(" ");
		
		
		String result = inputArr[0];			// ù��° ����� �񱳱����� ������
		
		for(String str : inputArr) {
			if(result.length() < str.length()) {
				result = str;
			}
		}
		
		
		System.out.println(result);
		
	}
	
	
	
}
