package section1_string;

import java.util.Scanner;

/**
 * ����
 * ���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ�
 * ���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �� �ݺ�Ƚ���� 1�� ��� �����մϴ�.
 * 
 * �Է�
 * ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
 * 
 * 
 * ���
 * ù �ٿ� ����� ���ڿ��� ����Ѵ�.
 * 
 * ���� �Է� 1 : KKHSSSSSSSE -> K2HS7E
 * ���� �Է� 2 : KSTTTSEEKFKKKDJJGG -> KST3SE2KFK3DJ2G2
 *
 * ���� 
 * 1. �Է¹��� ���ڿ��� ������� �ݺ� (max ���ڿ� ������ -1) 
 * 2. �پ��ִ� 2�� �ε����� ��Ҹ� String.charAt �� ������ ���Ͽ��θ� ��
 * 3. �����Ѱ�� counter ���� ���� ��Ű��, �������� �ʴ� ��� ��� ���ڿ��� �ش� ���ڸ� �߰�
 * 
 * @author kwang
 *
 */
public class CompressionString1_11 {

	// ����, ���� Ȯ�� ����
	// 2�ð� �ҿ� (����/�ڵ�) 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		CompressionString1_11 CompressionString = new CompressionString1_11();
		
		System.out.println(CompressionString.solution(input));
	}

	
	public String solution(String input) {
		
		String result = "";
		char char1 = ' ';
		char char2 = ' ';
		int counter = 1;
		
		String regex = "[0-1]";
		
		for(int loop=0;loop<input.length();loop++) {
			
			char1 = input.charAt(loop);
			
			if(loop+1 == input.length()) {
				result += ""+input.charAt(loop)+counter;
				break;
			}else {
				char2 = input.charAt(loop+1);				
			}
			
			if(char1 == char2) {
				counter++;
			}else {
				result += ""+char1+counter ;
				counter = 1;
			}
			char1 = ' ';
			char2 = ' ';
			
		}
		
		String answer = result.replaceAll(regex, "");
		
		
		return answer;
	}
	
}
