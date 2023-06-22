package section1_string;

import java.util.Scanner;

/**
 * ����
 * �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
 * ���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
 * ���ĺ� �̿��� ���ڵ��� �����մϴ�.
 * 
 * 
 * �Է�
 * ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
 * 
 * 
 * ���
 * ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.
 * 
 * ����) found7, time: study; Yduts; emit, 7Dnuof -> YES
 * @author kwang
 *
 * [�߿�] ������ 
 * 1. String.charAt() �� String.indexOf() ���� �����Ͽ� ���� �߻� -> java doc�� ide �� method command �� ��Ȯ�ϰ� �а� ����ؾ���  
 * 2. ���Խ��� ����� ���������ʾƼ� �ð����� �߻� -> ���Խ� ���� ���� �ʿ�
 * 3. String �� ȿ�������� ���� �� �� �ִ� StringBuilder Ȱ�� (�Ӹ����)     
 *
 */
public class No1_8_Palindrome {

	
	// ���� Ǯ�� 
	public static void main(String[] args) {
		
		String result = "";
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String regex = "[^A-z]";
		
		String original = input.toUpperCase().replaceAll(regex, "");
		
		// ���ڿ� ������
		StringBuilder stringBuilder = new StringBuilder(original);
		String tmp = stringBuilder.reverse().toString();
		
		if(original.equals(tmp)) {
			result = "YES";
		}else {
			result = "NO";
		}
		
		System.out.print(result);
		
	}
	
	///////////////////////////////////////////////////////////
	
	// ����
	// 1�ð� �̻� �ҿ� 
	// Ǯ�� Ȯ�ο��� 
	public static void main_pkh(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String input= in.nextLine(); 
		
		String result = "";
		
		No1_8_Palindrome palindrome = new No1_8_Palindrome();
		
		result = palindrome.solution_pkh(input);
		
		
		System.out.println(result);
	
	}
	
	
	public String solution_pkh(String input) {
		
		String result = "";
//		String regex = "[0-9~!@#$%^&*()-_=+.,\s]";		// error : �ش� ���Խ��� replaceAll�� ù��° ���ڷ� �����ϸ� �빮�ڰ� �ɸ� 
		
		String regex = "[^a-zA-Z]";		//regular expression
		
		String afterInput = "";
		
		String changeInput = ""; 
		
		
		afterInput = input.replaceAll(regex, "");
		
		afterInput = afterInput.toLowerCase();
		
		int size = afterInput.length();
		
		for(int loop=size-1 ; loop >= 0 ; loop--) {
			
			changeInput += afterInput.charAt(loop);
		}

		if(afterInput.equals(changeInput)) {
			result = "YES";
		}else {
			result= "NO";
		}
		
		return result;
		
	}
	
	
	
}
