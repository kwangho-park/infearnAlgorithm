package section1_string;

import java.util.Scanner;
import java.lang.Character;
/**
 * 
 * ���� ��ó : inflearn �ڹ� �˰��� ����Ǯ�� �Թ� 
 * 
 * ��ҹ��� ��ȯ <br> 
 * �빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * input : ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.  
 * output : ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����մϴ�
 * 
 * ���� : StuDY -> sTUdy
 * 
 * @author kwang
 *
 */
public class CharacterConversion1_2 {

	// ���� Ǯ�� 
	public static void main_inflearn(String args[]) { 
		
		
		Scanner in = new Scanner(System.in);
		
		String inputStr = in.next();
		
		char[] input = inputStr.toCharArray();
		
		String resultStr = "";
		
		for(int loop=0 ; loop < input.length;  loop ++) {
			
 
			if(Character.isUpperCase(input[loop])) {
				resultStr += Character.toLowerCase(input[loop]);
				
			}else {
				resultStr += Character.toUpperCase(input[loop]);

			}
		
		}
		
		System.out.println(resultStr);
		
		return ;
		
	}
	
	// ���� Ǯ�� (����) 
	// 2�ָ������ϱ� ���B�� �� ... 
	public static void main(String args[]) {
		
		String result = "";
		
		Scanner in = new Scanner(System.in);
		
		String input = in.next();
		
		
		char[] charArr = input.toCharArray();
		
		for(int loop=0;loop<charArr.length;loop++) {
			if(Character.isUpperCase(charArr[loop])) {
				result += Character.toString(charArr[loop]).toLowerCase();
			}else {
				result += Character.toString(charArr[loop]).toUpperCase();
			}
		}
		
		System.out.print(result);
		
		
	}
	
	
	
	
	// ����ó���� ������ �ǹ��� 
//	public static void main(String args[]) {
//		
//		
//		Scanner in = new Scanner(System.in);
//		
//		String inputStr = in.next();
//		
//		char[] input = inputStr.toCharArray();
//		
//		String resultStr = "";
//		char[] resultCh = new char[100];
//		
//		int loop2 = 0;
//		
//		for(int loop=0 ; loop < input.length;  loop ++) {
//			
// 
//			if(Character.isUpperCase(input[loop])) {
//				resultCh[loop2] = Character.toLowerCase(input[loop]);
//				loop2++;
//				
//				
//			}else {
//				resultCh[loop2] = Character.toUpperCase(input[loop]);
//				loop2++;
//			}
//		
//		}
//		
//		resultStr = new String(resultCh);
//		
//		System.out.println(resultStr);
//		
//		return ;
//		
//	}

}
