package section1_string;

import java.util.Scanner;

/**
 * ����
 * ���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.
 * ���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
 * 
 * �����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.
 * 
 * �Է�
 * ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
 * 
 * ���
 * ù �ٿ� �ڿ����� ����մϴ�.
 * 
 * ���� �Է� g0en2T0s8eSoft -> 208
 * @author dream
 * 
 * ���� 
 * 1. ���ڿ� ���ڰ� ���� ���ڿ� �Է� 
 * 2. String.replaceAll()�� ���Խ����� ���ڸ� �����Ͽ� ��� ������ ����
 * 
 * [�߿�] ����� 
 * 1. ���� Ǯ�̸� ���� �� ���� �ͼ������� ���� Ǯ�� �ҿ�ð��� �پ��
 * 2. Character.isDigit() �� ����Ÿ���� �����Ͱ� �������� Ȯ���ϴ� �޼ҵ带 Ȱ�� �� �� ����   
 *
 */
public class ExtractNumber1_9 {

	
	// ���� Ǯ��
	public static void main(String[] args) {
		
		String result = "";
		int resultInt = 0;
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		for(char ch:input.toCharArray()) {
			if(Character.isDigit(ch)) {
				result += ch;
			}
		}
		resultInt = Integer.parseInt(result);
		
		System.out.println(resultInt);
		
	}
	
	
	///////////////////////////////////////////////////////////
	
	
	// �ҿ�ð� 15�� 
	public static void main_pkh(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		ExtractNumber1_9 extractNumber = new ExtractNumber1_9();
		
		System.out.println(extractNumber.solution_pkh(input));
		
	}
	
	public int solution_pkh(String input) {
		
		String result = "";
		int resultInt = 0;
		
		String regEx = "[^0-9]";
		
		result = input.replaceAll(regEx, "");
		resultInt = Integer.parseInt(result);
		
		return resultInt;
		
	}
	

}
