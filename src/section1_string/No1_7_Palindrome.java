package section1_string;

import java.util.Scanner;

/**
 * ����
 * �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ�(Palindrome)�̶�� �մϴ�.
 *  * ���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.
 * 
 * �Է�
 * ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
 * 
 * ���
 * ù ��° �ٿ� ȸ�� ���ڿ������� ����� YES �Ǵ� NO�� ����մϴ�.
 * 
 * ex) gooG -> YES
 * 
 * [�߿�] ������
 * �ƴ°͵� �Ǽ��� �ʹ� �������� �ð��� �i������... ħ���ϰ� Ǯ����Ұ����� ������  
 * (3-4�� �Ǽ� :String �ݺ������� length() ���̸�ŭ �ݺ�, str.toLowerCase() �� ��ȯ���� �����ΰ� str�� rotationStr�� ���� ���...
 * ������ �����ѵ� �̰� ������ �����ɼ��� ������ ������ ���� 
 * 
 * @author kwang
 *
 */
public class No1_7_Palindrome {

	// ���� Ǯ�� 
	public static void main(String args[]) {
		
		No1_7_Palindrome Palindrome = new No1_7_Palindrome();
		Scanner in = new Scanner(System.in);
		String input=in.next();
		System.out.println(Palindrome.solution(input));
		
	}
	
	// ���� Ǯ�� 
	public String solution(String input) {
		String result="YES";
		
		input = input.toLowerCase();
		int length = input.length();
		
		for(int loop=0;loop<length/2;loop++) {
			if(input.charAt(loop)!=input.charAt(length-1-loop)) return "NO";
		}
		
		return result;
	}
	
	//////////////////////////////////////////////////////////////
	
	// 35�� �ҿ� 
	// ���� 
	public static void main_pkh(String args[]) {
		
		No1_7_Palindrome palindrom = new No1_7_Palindrome();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(palindrom.solution_pkh(str));
		
	}
	
	public String solution_pkh(String str) {
		
		String answer = "";
		String rotationStr="";
		
		String lowcaseStr = str.toLowerCase();
		
		for(int loop=lowcaseStr.length() - 1; loop >= 0 ; loop--) {
			
			rotationStr+= lowcaseStr.charAt(loop);
			
		}
		
		if(lowcaseStr.equals(rotationStr)) {
			answer = "YES";
		}else {
			answer = "NO";
		}
		
		
		return answer;
	}
	
}
